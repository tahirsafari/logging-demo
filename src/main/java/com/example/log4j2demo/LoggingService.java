package com.example.log4j2demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class LoggingService {

	private static final Logger logger = LogManager.getLogger(LoggingService.class);
	public void logRequest() {
		logger.info("Request logged in service");
	}
}
