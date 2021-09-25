package com.example.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.model.todomodel;
@Repository

public interface Todorepo extends MongoRepository<todomodel, String>  {
	
}

