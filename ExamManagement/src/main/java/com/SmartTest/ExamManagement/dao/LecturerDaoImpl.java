package com.SmartTest.ExamManagement.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SmartTest.ExamManagement.bean.LecturerRequestBean;
import com.SmartTest.ExamManagement.bean.ResponceBean;
import com.SmartTest.ExamManagement.entity.lecturersDetailsTO;
import com.SmartTest.ExamManagement.log.LoggerManager;

@Service
public class LecturerDaoImpl {
	
	public static final Logger LOGGER = LogManager.getLogger(CourseDaoImpl.class);
	
	@Autowired
	private LecturerDao lecturerDao;
	
	public ResponceBean AddLecturers(LecturerRequestBean bean) {
		
		LoggerManager.infoSimple(LOGGER, "inside Add lecturer dao layer");
		ResponceBean responce = new ResponceBean();
		
		try {
			
			lecturersDetailsTO newLecturers = new lecturersDetailsTO();
			
			
			newLecturers.setLecturerName(bean.getLecturerName());
			newLecturers.setLecturerAge(bean.getLecturerAge());
			newLecturers.setLecturerPhone(bean.getLecturerPhone());
			newLecturers.setLecturerEmail(bean.getLecturerEmail());
			newLecturers.setLecturerAddBy(bean.getLecturerAddBy());
			newLecturers.setCourseName(bean.getCourseName());
			newLecturers.setCourseDetails(bean.getCourseDetails());
			newLecturers.setRegistrationDate(bean.getRegistrationDate());
			newLecturers.setRegistrationLastDate(bean.getRegistrationLastDate());
			newLecturers.setExamDate(bean.getExamDate());
			
			lecturerDao.save(newLecturers);
			
			responce.setCode(200);
			responce.setMessage("Lecturer Created Sucessfully..");
			
			
		}catch (Exception e) {
			LoggerManager.infoSimple(LOGGER, e.toString());
			responce.setCode(500);
			responce.setMessage("System error occured! contact admin team asap!..");
		}
		
		return responce;
		
	}
	
	

}
