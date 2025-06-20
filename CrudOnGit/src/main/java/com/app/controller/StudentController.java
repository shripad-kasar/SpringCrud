package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
import com.app.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService ssi;
	
	@PutMapping("/update/{id}")
	public Student updateData(@RequestBody Student s,@RequestParam ("id") int id) {
	
		Student update = ssi.update(s,id);
		return update;
		
	}
}
