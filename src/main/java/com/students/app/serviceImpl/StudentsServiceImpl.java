package com.students.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.students.app.entities.Students;
import com.students.app.repository.StudentsRepository;
import com.students.app.services.StudentsService;

@Service
public class StudentsServiceImpl implements StudentsService {
	
	@Autowired
	StudentsRepository StudentsRepository;

	@Override
	public Students addStudent(Students student) {
		return StudentsRepository.save(student);
	}

	@Override
	public Students updateStudent(Integer id, Students student) {
		
		if(StudentsRepository.existsById(id)) {
			student.setId(id);
			return StudentsRepository.save(student);
		}
		return null;
	}

	@Override
	public List<Students> getStudentDetailsByIdOrNameOrClass(Students student) {
		List<Students> studentDetails = StudentsRepository.findByIdOrNameOrClass(student.getId(), student.getName(), student.getStudentClass());
		return studentDetails;
	}

}
