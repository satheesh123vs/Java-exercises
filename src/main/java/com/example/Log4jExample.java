package com.example;

import org.apache.log4j.Logger;

public class Log4jExample {

	final static Logger logger = Logger.getLogger(Log4jExample.class);

	public static void main(String[] args) {

		logger.info("Log4jExample");

		if (logger.isDebugEnabled()) {
			logger.debug("This is logger  : " + logger);
		}
		
		
		try{
			int i =5/0;
			
		}catch(Exception e){
			logger.error("error" + e);
		}
		
	}

}