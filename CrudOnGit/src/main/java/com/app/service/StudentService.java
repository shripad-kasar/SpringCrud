package com.app.service;

import com.app.model.Student;

public interface StudentService {


	public Student update(Student s, int id);

	public Student getData( int id);

	public Student save(Student s);



}
