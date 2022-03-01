package com.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyBalanceController {

	@GetMapping("/get-balance")
	public String getBalance() {
		return "Your current account balance is : 500000.00";
	}
}
