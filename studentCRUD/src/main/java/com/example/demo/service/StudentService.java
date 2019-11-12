package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repos.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repos;
	
	public Student add(Student student) {
		
		return repos.save(student);
	}
	
	public List<Student> findAll(){
		
		return this.repos.findAll();
		
	}
	
	public void removeStudent(long rollNumber) {
		
		 this.repos.deleteById(rollNumber);
		
	}
	
	public Student findByRollNumber(long rollNumber) {
		
		return this.repos.findByRollNumber(rollNumber);
	}
	
	

}
