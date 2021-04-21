package com.example.FirstApplication.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.FirstApplication.entity.Student;

@RestController
public class MyController {

	@RequestMapping(value="getStudent",method=RequestMethod.GET)
	public Student getStudent() {
	    return new Student("Shraddha", 27);
	}
	
	@RequestMapping(value="getStudentName",method=RequestMethod.POST)
	public String getStudentName(String Student) {
		return "shraddha";
	}
	 
	
}
