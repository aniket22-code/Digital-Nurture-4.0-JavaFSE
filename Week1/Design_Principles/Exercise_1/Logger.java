package com.singletonpattern;

public class Logger {
	
	private static Logger logInstance;
	
	private Logger() {
		System.out.println("Logger Object intialized");
	}
	
	
	
	public static Logger getLogger() {
		if(logInstance==null) {
			logInstance=new Logger();
		}
		return logInstance;
	}

}
