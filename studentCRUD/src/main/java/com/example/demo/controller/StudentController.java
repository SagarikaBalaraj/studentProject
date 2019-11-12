package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping(path="/students",produces="application/json",consumes="application/json")
	public Student addStudent(@RequestBody Student student) {
		
		
		return this.service.add(student);
	}
	
	@GetMapping(path="/students")
	public List<Student> findAll(){
		
		return this.service.findAll();
		
	}

	
	@DeleteMapping(path="/students/{rollNumber}")
	public void removeStudent(@PathVariable("rollNumber") long rollNumber) {
		
		this.service.removeStudent(rollNumber);
	}
	
	@GetMapping(path="/students/{rollNumber}")
	public Student findByRollNumber(@PathVariable long rollNumber) {
		
		return this.service.findByRollNumber(rollNumber);
	}
	
}
