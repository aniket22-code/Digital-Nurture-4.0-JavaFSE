package com.cognizant.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.Country;

@Service
public class CountryService {
	
	public Country getCountry(String code) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/cognizant/controller/country.xml");
		List<Country> countryList=(List<Country>) context.getBean("countryList");
		return countryList.stream().filter(c->c.getCode().equalsIgnoreCase(code))
				.findFirst()
				.orElse(null);
		
	}

}
