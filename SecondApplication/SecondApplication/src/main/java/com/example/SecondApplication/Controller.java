package com.example.SecondApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.FirstApplication.entity.Student;

@RestController
public class Controller {

	@RequestMapping(value = "name")
	public String getName() {
		return "pooja";
	}

	@RequestMapping(value = "getStudent")
	public Student getStudent() {
		RestTemplate restTemplate = new RestTemplate();
		final String uri = "http://localhost:8086/getStudent";
		Student result = restTemplate.getForObject(uri, Student.class);
		return result;
	}

	public void getTest() {
		RestTemplate restTemplate = new RestTemplate();
		final String uri = "http://localhost:8086/getStudent";
		String result = restTemplate.getForObject(uri, String.class);
		System.out.print(result);
		System.out.println("TEST1234");
	}
}
