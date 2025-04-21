package com.example.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.User;


@Service
public class UserService {

	List<User> list=new ArrayList<>();
	
	public UserService() {
		list.add(new User("abc","xyz","ABC@gmail.com"));
		list.add(new User("xyz","abc","XYZ@gmail.com"));
		list.add(new User("mnc","aop","MNC@gmail.com"));
	}
	
	
	//get all user
	public List<User> getAllUsers(){
		return this.list;
	}
	
	//get single user
	public User getUser(String name) {
		return this.list.stream().filter((user)->user.getName().equals(name)).findAny().orElse(null);
	}
	
	//add user
	public User addUser(User user) {
		this.list.add(user);
		return user;
	}
}
