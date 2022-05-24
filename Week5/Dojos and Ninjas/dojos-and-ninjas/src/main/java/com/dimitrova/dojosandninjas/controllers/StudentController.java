package com.dimitrova.dojosandninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dimitrova.dojosandninjas.models.Dojo;
import com.dimitrova.dojosandninjas.models.Ninja;
import com.dimitrova.dojosandninjas.services.DojoNinjaService;

@Controller
public class StudentController {
	
//	set up access to service
	@Autowired
	private DojoNinjaService dojoNinjaService;
	
	
//	create new ninja
	@GetMapping("/ninja/new")
	public String addNinja(@ModelAttribute("ninja") Ninja ninja, Model viewModel) {
		List<Dojo> allDojos = this.dojoNinjaService.allDojos();
		viewModel.addAttribute("allDojos", allDojos);
		return "newStudent.jsp";
	}
	
//	redirect to page showing people enrolled in a specific dojo
	@PostMapping("/ninja/createNinja")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model viewModel) {
		if(result.hasErrors()) {
			List<Dojo> allDojos = this.dojoNinjaService.allDojos();
			viewModel.addAttribute("allDojos", allDojos);
			return "newStudent.jsp";
		}
		this.dojoNinjaService.createNinja(ninja);
		return "redirect:/dojo/" + ninja.getDojo().getId();
	}
}

