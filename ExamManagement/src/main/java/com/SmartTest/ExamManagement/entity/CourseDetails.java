package com.SmartTest.ExamManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CourseDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String courseName;
	private String courseDetails;
	private String courseCreatedBy;
	private String courseRegisteredDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getCourseCreatedBy() {
		return courseCreatedBy;
	}

	public void setCourseCreatedBy(String courseCreatedBy) {
		this.courseCreatedBy = courseCreatedBy;
	}

	public String getCourseRegisteredDate() {
		return courseRegisteredDate;
	}

	public void setCourseRegisteredDate(String courseRegisteredDate) {
		this.courseRegisteredDate = courseRegisteredDate;
	}

}
