package com.example.FirstApplication.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.FirstApplication.entity.Student;

public interface StudentRepository extends MongoRepository<Student, String> { 
	
	@Override
	default List<Student> findAll() {
		
		return null;
	}
}
