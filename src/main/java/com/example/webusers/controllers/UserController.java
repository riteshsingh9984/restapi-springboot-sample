package com.example.webusers.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.webusers.modals.User;

import com.example.webusers.services.UserService;

@Controller
@RequestMapping("user")
public class UserController {

private static final String VIEWS = "user/";
	
	@Autowired
	private UserService userService;
	
	@GetMapping("add")
	public String getUserForm() {
		return VIEWS+"add-user";
	}
	
	@PostMapping("submit")
	public String saveUser(User user,ModelAndView mv) {
		userService.save(user);
		return "redirect:/user";
	}
	
	@GetMapping("")
	public ModelAndView getUserList(ModelAndView mv) {
		
		mv.setViewName(VIEWS+"user-list");
		
		List<User> users = userService.getAllUserList();
		
		mv.addObject("users",users);
		return mv;
}}
