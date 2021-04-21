package com.example.FirstApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FirstApplication.dao.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

	StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
}
