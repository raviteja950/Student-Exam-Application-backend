package com.SmartTest.ExamManagement.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SmartTest.ExamManagement.bean.CourseRequestBean;
import com.SmartTest.ExamManagement.bean.LecturerRequestBean;
import com.SmartTest.ExamManagement.bean.ResponceBean;
import com.SmartTest.ExamManagement.log.LoggerManager;
import com.SmartTest.ExamManagement.service.AdminService;
import com.SmartTest.ExamManagement.util.GetCurrentTimeStamp;
import com.SmartTest.ExamManagement.util.checkManadaortyFiledForCourse;

@CrossOrigin(originPatterns = "*", maxAge = 3600)
@RequestMapping("/Admin")
@RestController
public class AdminController {

	public static final Logger LOGGER = LogManager.getLogger(AdminController.class);

	@Autowired
	private checkManadaortyFiledForCourse fieldValidator;

	@Autowired
	private AdminService service;

	@PostMapping("/AddCourse")
	public ResponceBean AddCourse(@RequestBody CourseRequestBean bean) {
		LoggerManager.infoSimple(LOGGER, "Inside AddCourse API");
		ResponceBean responce = new ResponceBean();
		try {

			// checking the required filed are present or not in Request.
			boolean result = fieldValidator.checkMandatory(bean);
			if (result) {

				String getCurrentTime = GetCurrentTimeStamp.CurrentTimeStamp();
				bean.setCourseRegisteredDate(getCurrentTime);
				responce = service.AddCourse(bean);
			} else {
				LoggerManager.infoError(LOGGER,
						"CourseName,CourseDetails,courseCreatedBy Madatory Fields Cannot be empty or null!!.");
				responce.setCode(500);
				responce.setMessage(
						"CourseName,CourseDetails,courseCreatedBy Madatory Fields Cannot be empty or null!!.");
			}
		} catch (Exception exception) {
			LoggerManager.infoSimple(LOGGER, exception.toString());
			responce.setCode(500);
			responce.setMessage("System error occured! contact admin team asap!..");
		}
		return responce;
	}

	@PostMapping("/AddLecturer")
	public ResponceBean AddLecturer(@RequestBody LecturerRequestBean bean) {

		LoggerManager.infoSimple(LOGGER, "Inside Lecturer API");
		ResponceBean responce = new ResponceBean();

		try {

			boolean res = fieldValidator.checkMandatoryForLecturers(bean);

			if (res) {
				responce = service.AddLecturer(bean);
			} else {
				LoggerManager.infoError(LOGGER, "Enter All Mandatory Feilds");
				responce.setCode(500);
				responce.setMessage("Enter All Mandatory Feilds");
			}

		} catch (Exception e) {
			LoggerManager.infoSimple(LOGGER, e.toString());
			responce.setCode(500);
			responce.setMessage("System error occured! contact admin team asap!..");
		}

		return responce;

	}

}
