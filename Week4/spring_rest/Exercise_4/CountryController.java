package com.cognizant.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.Country;

@RestController
@RequestMapping("/")
public class CountryController {
	
	@GetMapping("country")
	public Country getIndi() {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/cognizant/controller/spring.xml");
		Country country=(Country) context.getBean("in");
		return country;
		
	}

}
