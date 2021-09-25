package com.example.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;  
import com.example.model.todomodel;
import com.example.repository.*;
@RestController
public class todocontroller {
	
	@Autowired
	 private Todorepo todorep;
	
	@RequestMapping("/todo")  
	public String hello()   
	{  
	return "Hello Hello";  
	}  
	@RequestMapping("/test")  
	public String test()   
	{  
	return "Hello test";  
	}
	@CrossOrigin("http://localhost:3000")
	@PostMapping("/addBook")
	public String saveBook(@RequestBody todomodel todo) {
		todorep.save(todo);
		return "Added book";
	}
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/tutorials")
	public List <todomodel> gettodo(){
		return todorep.findAll();
	}
}
 
