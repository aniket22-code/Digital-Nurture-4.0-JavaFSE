package com.cognizant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.entity.Account;


@RestController
@RequestMapping("/accounts")
public class AccountController {
	
	@GetMapping("/{number}")
	public Account getAccount(@PathVariable long number) {
		return new Account("savings", number, 234343.00);
	}
	

}
