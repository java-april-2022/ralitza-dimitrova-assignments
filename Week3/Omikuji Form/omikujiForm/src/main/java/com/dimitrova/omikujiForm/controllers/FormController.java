package com.dimitrova.omikujiForm.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	@GetMapping("/")
	public String index() {
		return "redirect:/omikuji";
	}
	
	@GetMapping("/omikuji")
	public String form() {
		return "index.jsp";
	}
	
	@GetMapping("/omikuji/results")
	public String result(HttpSession session, Model model) {
		
		String showStory = (String) session.getAttribute("story");
		
		model.addAttribute("showStory", showStory);
		
		return "showResults.jsp";
	}
	
	@PostMapping("/submitForm")
	public String submit(@RequestParam("number") String number, @RequestParam("city") String city,
			@RequestParam("person") String person, @RequestParam("job") String job,
			@RequestParam("animal") String animal, @RequestParam("compliment") String compliment,
			HttpSession session) {
		
		String story = String.format(
				"In %s years you will live in %s with %s as your roommate, %s. The next time you see a %s, you will have good luck. Also, %s",
				number, city, person, job, animal, compliment);
		
		session.setAttribute("story", story);
		
		return "redirect:/omikuji/results";
	}
}
