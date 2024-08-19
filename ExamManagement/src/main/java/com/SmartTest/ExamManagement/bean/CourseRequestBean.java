package com.SmartTest.ExamManagement.bean;

public class CourseRequestBean {

	private String courseName;
	private String courseDetails;
	private String courseCreatedBy;
	private String courseRegisteredDate;

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
