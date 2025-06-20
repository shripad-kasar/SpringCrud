package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService ssi;
	
	@DeleteMapping("/delete/{id}")
	public String deleteData(@PathVariable ("id") int id) {
		String delete = ssi.delete(id);
		return delete;
	}
}
