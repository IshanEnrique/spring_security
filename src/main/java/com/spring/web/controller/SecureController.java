package com.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecureController {

	@GetMapping("/balance")
	public String getBalance() {
		return "secure/balance";
	}
	@GetMapping("/transaction-history")
	public String transactionHistory() {
		return "secure/transactions";
	}
	@GetMapping("/cards")
	public String getCards() {
		return "secure/cards";
	}
}
