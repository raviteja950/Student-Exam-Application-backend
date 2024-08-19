package com.SmartTest.ExamManagement.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.SmartTest.ExamManagement.bean.CourseRequestBean;
import com.SmartTest.ExamManagement.bean.ResponceBean;
import com.SmartTest.ExamManagement.entity.CourseDetails;
import com.SmartTest.ExamManagement.log.LoggerManager;

@Service
public class CourseDaoImpl {
	public static final Logger LOGGER = LogManager.getLogger(CourseDaoImpl.class);

	private @Autowired CourseDao courseDao;

	public ResponceBean AddCourse(CourseRequestBean bean) {

		LoggerManager.infoSimple(LOGGER, "inside Add course dao layer");
		ResponceBean responce = new ResponceBean();
		try {
			CourseDetails courseDetails = new CourseDetails();

			courseDetails.setCourseName(bean.getCourseName());
			courseDetails.setCourseDetails(bean.getCourseDetails());
			courseDetails.setCourseCreatedBy(bean.getCourseCreatedBy());
			courseDetails.setCourseRegisteredDate(bean.getCourseRegisteredDate());
			courseDao.save(courseDetails);
			responce.setCode(200);
			responce.setMessage("Course Created Sucessfully..");

		} catch (Exception exception) {
			LoggerManager.infoSimple(LOGGER, exception.toString());
			responce.setCode(500);
			responce.setMessage("System error occured! contact admin team asap!..");
		}

		return responce;
	}
}
