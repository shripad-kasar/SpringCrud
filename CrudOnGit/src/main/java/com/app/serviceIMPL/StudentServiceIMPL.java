package com.app.serviceIMPL;

import java.util.Optional;

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
	public Student getData( int id) {
		Optional<Student> findById = sr.findById(id);
		if(findById.isPresent())
		{
			return findById.get();
		}
		return null;
	}
}
