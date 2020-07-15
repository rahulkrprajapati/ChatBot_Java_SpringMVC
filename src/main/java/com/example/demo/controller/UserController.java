package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.services.UserService;



@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("/signup")
	public String register(@RequestBody User user) {
		service.signup(user);
		return "User Added";
	}
	
	@PostMapping(value="/signin")
	public User login(@RequestBody User user)
	{
		return service.login(user);
	}
}
