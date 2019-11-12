package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Teacher;
import com.example.demo.service.TeacherService;

@RestController
public class TeacherController {

	@Autowired
	private TeacherService service;
	
	
	@PostMapping(path="/teachers",produces="application/json",consumes="application/json")
	public Teacher addTeacher(@RequestBody Teacher teacher) {
		
		return service.add(teacher);
	}
	
	@GetMapping(path="/teachers")
	public List<Teacher> findAll(){
		return service.findAll();
	}
	
	@GetMapping(path="/teachers/{id}")
	public Teacher findById(@PathVariable("id") long id) {
		
		return service.findById(id);
	}
}
