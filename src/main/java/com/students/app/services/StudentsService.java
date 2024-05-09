package com.students.app.services;

import java.util.List;

import com.students.app.entities.Students;

public interface StudentsService {

	//Add Student
	Students addStudent(Students student);
	
	//get student details by id or name or class
	List<Students> getStudentDetailsByIdOrNameOrClass(Students student);
	
	//update student
	Students updateStudent(Integer id, Students student);
	
}
