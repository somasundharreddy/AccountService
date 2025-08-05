package com.ecommerce.accountservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Value("${server.port}")
	private int serverPort;
	
	@GetMapping
	public String getAccount() {
		return "Account service : "+serverPort;
	}	
}