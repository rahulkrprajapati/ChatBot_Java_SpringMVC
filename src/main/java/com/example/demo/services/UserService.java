package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;



@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public User signup(User user) {
		return repository.save(user);
	}
	
	public User login(User user){
		User userInfo=repository.findById(user.getUsername()).orElse(new User());	
		if((user.getPassword()).equals(userInfo.getPassword())){
			return userInfo;
		}
		return userInfo;
	}
}
