package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repos.LoginRepository;

@Service
public class UserService {

	@Autowired
	private LoginRepository repos;
	
	public User add(User user) {
		
		
		return this.repos.save(user);
		
	}
	
	public List<User> findAll(){
		
		return this.repos.findAll();
	}
	
	public User findById(long id) {
		return this.repos.findById(id);
	}
	
	public String authenticateUser(User user) {
		User authenticate=findById(user.getId());
		if(authenticate!=null) {
			
			if(user.getId()==authenticate.getId()&&user.getPassWord()==authenticate.getPassWord()&&user.getUserType()==authenticate.getUserType()){
				
				return "Login successful";
				
			}
			
		}

			return " login unsuccessful";
		
		
	}
}