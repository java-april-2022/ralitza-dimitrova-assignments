package com.dimitrova.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dimitrova.dojosandninjas.models.Dojo;
import com.dimitrova.dojosandninjas.services.DojoNinjaService;

@Controller
public class DojoController {
	
//	set up access to service
	@Autowired
	private DojoNinjaService dojoNinjaService;
	
//	redirect to new dojo page
	@GetMapping("/")
	public String home() {
		return "redirect:/dojo/new";
	}
	
//	create new dojo
	@GetMapping("/dojo/new")
	public String createDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "newDojo.jsp";
	}
	
//	validate new dojo and send to new ninja creation page
	@PostMapping("/dojo/createDojo")
	public String newDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		
		if(result.hasErrors()) {
			return "newDojo.jsp";
		}
		
		this.dojoNinjaService.createDojo(dojo);
		return "redirect:/ninja/new";
	}
	
//	dojo info page
	@GetMapping("/dojo/{id}")
	public String showDojo(Model viewModel, @PathVariable("id") Long id) {
		viewModel.addAttribute("dojo", this.dojoNinjaService.getOneDojo(id));
		return "dojoInfo.jsp";
	}
}
