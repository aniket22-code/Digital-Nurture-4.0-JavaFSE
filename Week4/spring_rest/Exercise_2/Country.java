package com.example.learn.country;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
	private String code;
	
	private String name;
	
	private static final Logger logger=LoggerFactory.getLogger(Country.class);
	
	public Country() {
		logger.info("Inside Country Constructor");
	}


	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}
}
