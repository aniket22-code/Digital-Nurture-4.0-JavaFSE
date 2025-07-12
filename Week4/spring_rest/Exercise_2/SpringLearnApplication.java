package com.example.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.learn.country.Country;

@SpringBootApplication
public class SpringLearnApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(SpringLearnApplication.class);
	
	
	public static void displayCountry() {
		logger.info("entered into displayCountry");
		ApplicationContext context=new ClassPathXmlApplicationContext("com/example/learn/country.xml");
		Country country=(Country)context.getBean("country",Country.class);
		logger.debug("Country : {}", country.toString());
		
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		logger.info("we have succesfully started......");
		displayCountry();
	}

}
