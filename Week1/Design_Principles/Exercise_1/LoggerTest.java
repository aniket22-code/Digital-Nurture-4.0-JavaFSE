package com.singletonpattern;

public class LoggerTest {
	public static void main(String[] args) {
		
		Logger logger1=Logger.getLogger();
		
		Logger logger2=Logger.getLogger();
		
		System.out.println(logger1==logger2);

	}

}
