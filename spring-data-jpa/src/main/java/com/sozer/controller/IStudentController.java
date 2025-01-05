package com.sozer.controller;

import java.util.List;

import com.sozer.entities.Student;

public interface IStudentController {
	
	public Student saveStudent(Student student) ;
	
	public List<Student> getAllStudents();
	
	public Student getStudentById(Integer id);
	
	public void deleteStudent(Integer id);
	
	public Student updateStudent(Integer id, Student updateStudent);
	
	
		
		
		
	

}
