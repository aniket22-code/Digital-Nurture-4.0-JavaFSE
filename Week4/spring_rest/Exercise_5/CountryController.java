package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.Country;

@RestController
@RequestMapping("/")
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	@GetMapping("country/{code}")
	public Country getCountry(@PathVariable String code) {
		return countryService.getCountry(code);
	}

}

