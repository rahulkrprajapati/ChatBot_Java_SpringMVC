package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="questions")
public class Question {

	@Id
	private String id;
	private String question;
	private String option;

	public String getId() {
		return id;
	}


	public String getQuestion() {
		return question;
	}


	public String getOption() {
		return option;
	}
	
}
