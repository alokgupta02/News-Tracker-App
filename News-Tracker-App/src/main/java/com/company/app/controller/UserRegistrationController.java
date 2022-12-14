package com.company.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.app.dto.UserRegistrationDto;
import com.company.app.service.UserService;


@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
	
	private UserService userService;
	
	public UserRegistrationController(UserService userService) {
		super();
		this.userService= userService;
	}
	
	@ModelAttribute("user")
	public UserRegistrationDto userRegistrationDto() {
		return new UserRegistrationDto();
	}
				
	@GetMapping
	public String showRegistrationForm() {
		return "access/registration";
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		userService.save(registrationDto);
		return "redirect:/registration?success";
	}
	
}
