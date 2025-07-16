package com.cognizant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.entity.Loans;

@RestController
@RequestMapping("/loans")
public class LoanController {

	@GetMapping("/{number}")
	public Loans getLoan(@PathVariable String number) {
		return new Loans(number, "car", 400000,3258, 18);
	}
}
