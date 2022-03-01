package com.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyAccountController {

	@GetMapping("/my-account")
	public String myAccount() {
		return "Hello My Account";
	}
}
