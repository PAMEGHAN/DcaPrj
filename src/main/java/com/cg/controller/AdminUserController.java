package com.cg.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.User;
import com.cg.serviceimpl.UserService;

@RestController
public class AdminUserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/addUser")
	public List<User> addUser(@Valid @RequestBody User user) {
		return userService.addUser(user);
	}

	@PutMapping("/validateUser/{id}/{password}")
	public String validateUser(@PathVariable("id") int uid,@PathVariable("password") String password) {
		return userService.validateUser(uid,password);
	}
	

    }

