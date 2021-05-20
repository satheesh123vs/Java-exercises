package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JExample {

	final static Logger logger = LoggerFactory.getLogger("SLF4JExample");

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