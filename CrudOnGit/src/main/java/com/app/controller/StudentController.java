package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
import com.app.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService ssi;
	
	public Student saveData(@RequestBody Student s) {
		Student save = ssi.save(s);
		return save;
	}
}
