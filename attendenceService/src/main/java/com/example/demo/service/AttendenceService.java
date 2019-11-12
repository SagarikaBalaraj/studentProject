package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Attendence;
import com.example.demo.repository.AttendenceRepository;

@Service
public class AttendenceService {

	@Autowired
	private AttendenceRepository repo;
	
	public Attendence add(Attendence attendence) {
		
		return this.repo.save(attendence);
		
	}
	
	public List<Attendence> findAll(){
		return this.repo.findAll();
	}
	
	public List<Attendence> findByRollNumberAndMonth(long rollNumber,int month){
		
		return this.repo.findByRollNumberAndMonth(rollNumber, month);
	}
}
