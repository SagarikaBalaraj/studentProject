package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Attendence;
import com.example.demo.service.AttendenceService;

@RestController
public class AttendenceController {

	@Autowired
	private AttendenceService service;
	
	@PostMapping(path="/attendence",produces="application/json",consumes="application/json")
	public Attendence add(@RequestBody Attendence attendence) {
		
		return this.service.add(attendence);
	}
	
	@GetMapping(path="/attendence")
	public List<Attendence> findAll(){
		
		return this.service.findAll();
	}
	
	@GetMapping(path="/attendence/{rollNumber}/{month}")
	public List<Attendence> findByRollNumberAndMonth(@PathVariable("rollNumber") long rollNumber,@PathVariable("month") int month){
		
		return this.service.findByRollNumberAndMonth(rollNumber, month);
	}
	
	
	
}
