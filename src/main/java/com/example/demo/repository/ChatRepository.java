package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Chat;



@Repository
public interface ChatRepository extends MongoRepository<Chat,String> {
 
}

