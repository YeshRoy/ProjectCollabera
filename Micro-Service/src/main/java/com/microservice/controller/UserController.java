package com.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.bean.User;
import com.microservice.pojo.ResponsetTemplateVO;
import com.microservice.service.UserService;

@RestController

public class UserController {
	@Autowired
	private UserService service;
	
	@GetMapping("/getUser/{userId}")
	public User getUser(@PathVariable int userId) {
		return service.getUser(userId);
	}
	@GetMapping("/userDept/{userId}")
	public ResponsetTemplateVO getUserDept(@PathVariable int userId) {
		return service.getuserDept(userId);
	}
	@PostMapping("/user")
	public User addUser(@RequestBody int user) {
		return service.getUser(user);
	}
}

