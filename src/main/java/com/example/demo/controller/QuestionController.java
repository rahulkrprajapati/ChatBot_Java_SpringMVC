package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Question;
import com.example.demo.services.QuestionService;


@RestController
public class QuestionController {

	@Autowired
	private QuestionService service;
	
	
	@GetMapping("/Questions")
	public List<Question> getQuestions(){
		return service.getQuestions();
	}
	
	
}
