package com.SmartTest.ExamManagement.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GetCurrentTimeStamp {

	public static String CurrentTimeStamp() {

		// Get the current date and time
		LocalDateTime now = LocalDateTime.now();
		// Define the format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		// Format the current date and time
		String formattedNow = now.format(formatter);

		return formattedNow;
	}
}
