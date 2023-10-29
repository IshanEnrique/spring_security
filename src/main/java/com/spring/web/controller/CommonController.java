package com.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController {

	@GetMapping(path = {"/","/home"})
	public String home() {
		System.out.println("========> Home Page");
		return "home";
	}
	@GetMapping(path = {"/login"})
	public String login() {
		System.out.println("========> Login Page");
		return "login";
	}
}
