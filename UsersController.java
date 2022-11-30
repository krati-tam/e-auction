package com.example.demo.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/users")
public class UsersController {
	
	@GetMapping
	public String getUsers()
	{
		return "GET";
	
	}
	
	@GetMapping(path ="/{userID}")
	public String getUser(@PathVariable String userID)
	{
		return "GET for UserID: "+userID;
	
	}
	@PostMapping
	public String createUser()
	{
		return "POST";
	
	}
	
	@PutMapping
	public String updateUser()
	{
		return "PUT";
	
	}
	
	@DeleteMapping
	public String deleteUser()
	{
		return "DELETE";
	
	}
	

}
