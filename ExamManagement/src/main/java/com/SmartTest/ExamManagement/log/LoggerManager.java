package com.SmartTest.ExamManagement.log;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

public class LoggerManager {

	public static void infoSimple(Logger logger, String message) {
		logger.info(message);
	}

	public static void infoError(Logger logger, String ErrorMessage) {
		logger.error(ErrorMessage);
	}

	public static void LogError(Logger logger, String ErrorMessage, Throwable t) {
		logger.log(Level.ERROR, ErrorMessage, t);
	}
}
