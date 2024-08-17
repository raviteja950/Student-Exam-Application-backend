package com.SmartTest.ExamManagement.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SmartTest.ExamManagement.util.LoggerManager;

@CrossOrigin(originPatterns = "*", maxAge = 3600)
@RequestMapping("/Admin")
@RestController
public class AdminController {

	public static final Logger LOGGER = LogManager.getLogger(AdminController.class);

	@PostMapping("/AddCourse")
	public void AddCourse() {
		LoggerManager.infoSimple(LOGGER, "Inside AddCourse API");
	}

}
