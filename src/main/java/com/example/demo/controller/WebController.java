package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	@GetMapping("/hello")
	public String greeting() {
		return "Congratulations on your onboarding! Mr. Manishkumar Yadav!! Welcome to the Coginizant family...";
	}
}
