package com.students.app.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.students.app.entities.Students;
import com.students.app.services.StudentsService;

@RestController
@RequestMapping("/students/api/")
public class StudentController {
	
	@Autowired
	StudentsService studentsService;

	@PostMapping("addStudent")
	public ResponseEntity<Students> addStudent(@RequestBody Students student) {
		
		try {
			student = studentsService.addStudent(student);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ResponseEntity.ok(student);
	}
	
	@PutMapping("updateStudent")
	public ResponseEntity<Students> updateStudentById(@RequestParam Integer id, @RequestBody Students student) {
		
		try {
			student = studentsService.updateStudent(id, student);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return student != null ? ResponseEntity.ok(student) : ResponseEntity.notFound().build();
		
	}
	
	@PostMapping("getStudentDetailsByIdOrNameOrClass")
	public ResponseEntity<List<Students>> getStudentDetailsByIdOrNameOrClass(@RequestBody Students student) {
		List<Students> studentDetails = null;
		
		try {
			studentDetails = studentsService.getStudentDetailsByIdOrNameOrClass(student);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return studentDetails != null ? ResponseEntity.ok(studentDetails) : ResponseEntity.notFound().build();
	}
}
