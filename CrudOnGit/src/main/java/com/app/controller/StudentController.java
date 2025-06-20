package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

	@DeleteMapping("/delete/{id}")
	public String deleteData(@PathVariable ("id") int id) {
		String delete = ssi.delete(id);
		return delete;
	}
	
	@PutMapping("/update/{id}")
	public Student updateData(@RequestBody Student s, @RequestParam("id") int id) {

		Student update = ssi.update(s, id);
		return update;
	}

	@GetMapping("/getData/{id}")
	public Student getData(@RequestParam("id") int id) {

		Student data = ssi.getData(id);
		return data;
	}

	@PostMapping("/save")
	public Student saveData(@RequestBody Student s) {
		Student save = ssi.save(s);
		return save;

	}
}
