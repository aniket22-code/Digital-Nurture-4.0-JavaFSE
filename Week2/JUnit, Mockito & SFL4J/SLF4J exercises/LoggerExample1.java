package org.test.Testing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerExample1 {

	private static final Logger logger=LoggerFactory.getLogger(LoggerExample1.class);
	
	public static void main(String[] args) {
		logger.info("Application Started");
		
		logger.warn("This is a warn message");
		logger.error("This is an error message");
		
		try {
			int result=10/0;
		}catch (ArithmeticException ex) {
			logger.error("Exception occured:",ex.getMessage(),ex);
		}
		
		logger.info("Application Closed");
	}
}
