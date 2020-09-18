package com.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.registration.dao.UserRepo;
import com.registration.model.User;

@Controller
public class MainController {

	@Autowired
	UserRepo userRepo;
	
	// Blank Registration Form 
	@GetMapping("/register")
	public String showForm(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "register_form";
	}
	// Filled Registration Form submitted 
	@PostMapping("/register")
	public String submitForm(@ModelAttribute("user") User user) {
		userRepo.save(user);
		return "register_success";
	}
}
