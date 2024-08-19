package com.SmartTest.ExamManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class lecturersDetailsTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int lecturerId;
	
	private String lecturerName;
	
	private int lecturerAge;
	
	private long lecturerPhone;
	
	private String lecturerEmail;
	
	private String lecturerAddBy;
	
	private String courseName;
	
	private String courseDetails;
	
	private String registrationDate;
	
	private String registrationLastDate;
	
	private String examDate;

	
	

	public lecturersDetailsTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public lecturersDetailsTO(int lecturerId, String lecturerName, int lecturerAge, long lecturerPhone,
			String lecturerEmail,String lecturerAddBy, String courseName, String courseDetails, String registrationDate,
			String registrationLastDate, String examDate) {
		super();
		this.lecturerId = lecturerId;
		this.lecturerName = lecturerName;
		this.lecturerAge = lecturerAge;
		this.lecturerPhone = lecturerPhone;
		this.lecturerEmail = lecturerEmail;
		this.lecturerAddBy = lecturerAddBy;
		this.courseName = courseName;
		this.courseDetails = courseDetails;
		this.registrationDate = registrationDate;
		this.registrationLastDate = registrationLastDate;
		this.examDate = examDate;
	}

	public String getLecturerAddBy() {
		return lecturerAddBy;
	}

	public void setLecturerAddBy(String lecturerAddBy) {
		this.lecturerAddBy = lecturerAddBy;
	}

	public int getLecturerId() {
		return lecturerId;
	}

	public void setLecturerId(int lecturerId) {
		this.lecturerId = lecturerId;
	}

	public String getLecturerName() {
		return lecturerName;
	}

	public void setLecturerName(String lecturerName) {
		this.lecturerName = lecturerName;
	}

	public int getLecturerAge() {
		return lecturerAge;
	}

	public void setLecturerAge(int lecturerAge) {
		this.lecturerAge = lecturerAge;
	}

	public double getLecturerPhone() {
		return lecturerPhone;
	}

	public void setLecturerPhone(long lecturerPhone) {
		this.lecturerPhone = lecturerPhone;
	}

	public String getLecturerEmail() {
		return lecturerEmail;
	}

	public void setLecturerEmail(String lecturerEmail) {
		this.lecturerEmail = lecturerEmail;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDetails() {
		return courseDetails;
	}

	public void setCourseDetails(String courseDetails) {
		this.courseDetails = courseDetails;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getRegistrationLastDate() {
		return registrationLastDate;
	}

	public void setRegistrationLastDate(String registrationLastDate) {
		this.registrationLastDate = registrationLastDate;
	}

	public String getExamDate() {
		return examDate;
	}

	public void setExamDate(String examDate) {
		this.examDate = examDate;
	}
	
	
	
	

}
