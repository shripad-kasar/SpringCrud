package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
import com.app.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService ssi;
	
	@GetMapping("/getData/{id}")
	public Student getData(@RequestParam ("id") int id) {
		
		Student data = ssi.getData(id);
		return data;
		
		
	}
}
