package com.example.webusers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.webusers.modals.User;
import com.example.webusers.services.UserService;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("index")
	public String getWelcome() {
		
		return "user-index";
	}
	
	@ResponseBody
	@GetMapping("get")
	public User getUserDemo() {
		User user = userService.getUser();
		user.setName("Demo User");
		user.setAddress("Hello address");
		user.setPassword("122331");
		user.setUsername("hellousername");
		return user;
	}
	
}
