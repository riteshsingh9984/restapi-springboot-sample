package com.example.webusers.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webusers.modals.User;
import com.example.webusers.repositories.UserRepository;



@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User save(User user) {
		
		return userRepository.save(user);
	}
	
	public List<User> getAllUserList(){
		
		return userRepository.findAll();
	}
}
