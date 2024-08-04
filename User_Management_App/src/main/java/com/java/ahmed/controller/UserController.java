package com.java.ahmed.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private com.java.ahmed.repository.UserRepository userRepo;

	@ModelAttribute
	private void userDetails(Model m, Principal p) {
		String email = p.getName();
		com.java.ahmed.entity.UserDtls user = userRepo.findByEmail(email);
		m.addAttribute("user", user);

	}

	@GetMapping("/")
	public String home() {
		return "user/home";
	}

}