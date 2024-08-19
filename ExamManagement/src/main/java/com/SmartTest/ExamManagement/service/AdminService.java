package com.SmartTest.ExamManagement.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.SmartTest.ExamManagement.bean.CourseRequestBean;
import com.SmartTest.ExamManagement.bean.LecturerRequestBean;
import com.SmartTest.ExamManagement.bean.ResponceBean;
import com.SmartTest.ExamManagement.dao.CourseDaoImpl;
import com.SmartTest.ExamManagement.dao.LecturerDaoImpl;
import com.SmartTest.ExamManagement.log.LoggerManager;

@Service
public class AdminService {

	public static final Logger LOGGER = LogManager.getLogger(AdminService.class);

	private @Autowired CourseDaoImpl courseImpl;
	
	@Autowired
	private LecturerDaoImpl lecturerImpl;

	public ResponceBean AddCourse(CourseRequestBean bean) {

		LoggerManager.infoSimple(LOGGER, "inside Add course Service layer");
		ResponceBean responce = new ResponceBean();
		try {
			// course can only be creted my admin
			if (bean.getCourseCreatedBy().equalsIgnoreCase("Admin")) {
				// saving the course details to database
				responce=courseImpl.AddCourse(bean);
			} else {
				responce.setCode(300);
				responce.setMessage("Course Can only be Created by Admin only...");
			}
		} catch (Exception exception) {
			LoggerManager.infoSimple(LOGGER, exception.toString());
			responce.setCode(500);
			responce.setMessage("System error occured! contact admin team asap!..");
		}
		return responce;
	}
	
	
	public ResponceBean AddLecturer(LecturerRequestBean bean) {

		LoggerManager.infoSimple(LOGGER, "inside Add Lecturer Service layer");
		ResponceBean responce = new ResponceBean();
		try {

			if (bean.getLecturerAddBy().equalsIgnoreCase("Admin")) {
				responce=lecturerImpl.AddLecturers(bean);
			} else {
				responce.setCode(300);
				responce.setMessage("Lecturer Can only be Created by Admin only...");
			}
		} catch (Exception exception) {
			LoggerManager.infoSimple(LOGGER, exception.toString());
			responce.setCode(500);
			responce.setMessage("System error occured! contact admin team asap!..");
		}
		return responce;
	}

}
