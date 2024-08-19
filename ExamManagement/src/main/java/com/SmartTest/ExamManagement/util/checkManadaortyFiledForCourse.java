package com.SmartTest.ExamManagement.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.SmartTest.ExamManagement.bean.CourseRequestBean;
import com.SmartTest.ExamManagement.bean.LecturerRequestBean;
import com.SmartTest.ExamManagement.log.LoggerManager;

@Component
public class checkManadaortyFiledForCourse {

	public static final Logger LOGGER = LogManager.getLogger(checkManadaortyFiledForCourse.class);

	public boolean checkMandatory(CourseRequestBean bean) {

		LoggerManager.infoSimple(LOGGER, "inside chcekMandatory Method");
		boolean result = true;

		if ( bean.getCourseName() == null || bean.getCourseName().isEmpty()
				|| bean.getCourseDetails() == null        || bean.getCourseDetails().isEmpty() 
				|| bean.getCourseCreatedBy() == null      || bean.getCourseCreatedBy().isEmpty()
				) {
			result = false;
		}
		return result;

	}
	
	public boolean checkMandatoryForLecturers(LecturerRequestBean bean) {
		
		LoggerManager.infoSimple(LOGGER, "inside chcekMandatory Method");
		boolean result = true;
		
		if(	bean.getLecturerName().isEmpty() || bean.getLecturerName() == null ||
			bean.getLecturerAge() == 0 || bean.getLecturerEmail() == null ||
			bean.getLecturerEmail().isEmpty() || bean.getLecturerPhone() == 0 ||
			bean.getLecturerAddBy().isEmpty() || bean.getLecturerAddBy() == null ||
			bean.getCourseName().isEmpty() || bean.getCourseName() == null ||
			bean.getCourseDetails().isEmpty() || bean.getCourseDetails() == null
		   ) {
			result = false;
		}
		
		return result;
		
	}
}
