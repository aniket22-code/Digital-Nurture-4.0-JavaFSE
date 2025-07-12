package com.example.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping("hello")
	public String sayHello() {
		logger.info("START: sayHello()");
        
        String message = "Hello World!!";

        logger.info("END: sayHello()");
        return message;
	}
	
}
