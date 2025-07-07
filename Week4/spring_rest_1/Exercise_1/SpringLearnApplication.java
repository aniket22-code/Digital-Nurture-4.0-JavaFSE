package com.example.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearnApplication {
	private static final Logger logger=LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
		logger.info("helo........");
		SpringApplication.run(SpringLearnApplication.class, args);
		logger.info("Main method launched succesfully.....");
	}

}
