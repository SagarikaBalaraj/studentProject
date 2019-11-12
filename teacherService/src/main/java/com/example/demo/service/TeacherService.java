package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Teacher;
import com.example.demo.repos.TeacherRepository;

@Service
public class TeacherService {

	@Autowired
	private TeacherRepository repos;
	
	
	public Teacher add(Teacher teacher) {
		
		return this.repos.save(teacher);
		
	}
	
	public List<Teacher> findAll(){
		
		return this.repos.findAll();
	}
	
	
	public  Teacher findById(long id) {
		
		
		return this.repos.findById(id);
	}
	
	

	
}
