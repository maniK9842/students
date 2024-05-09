package com.students.app.entities;

import java. util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Students {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	
	@Column(name="name")
    private String name;

	@Column(name="date_of_birth")
    private Date dateOfBirth;

	@Column(name="joinning_date")
    private Date joinningDate;

	@Column(name="class")
    private String studentClass;
	
	public Students() {
		super();
	}

	public Students(Integer id, String name, Date dateOfBirth, Date joinningDate, String studentClass) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.joinningDate = joinningDate;
		this.studentClass = studentClass;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getJoinningDate() {
		return joinningDate;
	}

	public void setJoinningDate(Date joinningDate) {
		this.joinningDate = joinningDate;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", joinningDate="
				+ joinningDate + ", studentClass=" + studentClass + "]";
	}

	
}