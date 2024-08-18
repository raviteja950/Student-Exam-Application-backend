package com.SmartTest.ExamManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SmartTest.ExamManagement.entity.CourseDetails;

@Repository
public interface CourseDao extends JpaRepository<CourseDetails, Long> {

}
