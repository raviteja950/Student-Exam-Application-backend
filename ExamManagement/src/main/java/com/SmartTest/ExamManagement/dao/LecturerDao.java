package com.SmartTest.ExamManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SmartTest.ExamManagement.entity.lecturersDetailsTO;

@Repository
public interface LecturerDao extends JpaRepository<lecturersDetailsTO, Integer> {

}
