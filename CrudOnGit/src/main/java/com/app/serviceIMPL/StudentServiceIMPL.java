package com.app.serviceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Student;
import com.app.repository.StudentRepo;
import com.app.service.StudentService;

@Service
public class StudentServiceIMPL implements StudentService {

	@Autowired
	StudentRepo sr;

	@Override
	public Student save(Student s) {
		Student save = sr.save(s);
		return save;
	}
}
