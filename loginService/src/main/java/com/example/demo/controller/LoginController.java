package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class LoginController {

	@Autowired
	private UserService service;
	
	@PostMapping(path="/login",produces="application/json",consumes="application/json")
	public User add(@RequestBody User user) {
		
		return this.service.add(user);
		
	}
	
	@GetMapping(path="/login")
	public List<User> findAll(){
		return this.service.findAll();
	}
	
	@GetMapping(path="/login/{id}")
	public User findById( @PathVariable("id") long id) {
		return  this.service.findById(id);
	}
	
	@PostMapping(path="/login/authenticate")
	public String authenticateUser(@RequestBody User user) {
		return this.service.authenticateUser(user);
	}
}
