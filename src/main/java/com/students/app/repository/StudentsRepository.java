package com.students.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.students.app.entities.Students;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Integer>{

	@Query("SELECT student FROM Students student WHERE student.id =:id OR student.name =:name OR student.studentClass =:studentClass")
	List<Students> findByIdOrNameOrClass(Integer id, String name, String studentClass);

}

