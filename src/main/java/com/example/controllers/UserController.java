package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	
	//all users
	@GetMapping("/")
	public List<User> getAllUsers(){
		return this.userService.getAllUsers();
	}
	
	@GetMapping("/{name}")
	public User getUser(@PathVariable("name")String name) {
		return this.userService.getUser(name);
	}
	
	@PostMapping("/")
	public User add(@RequestBody User user) {
		return this.userService.addUser(user);
	}
	
}
