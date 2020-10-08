package com.example.webusers.services;

import org.springframework.stereotype.Service;

import com.example.webusers.modals.User;

@Service
public class UserService {

	public User getUser() {
		return new User();
	}
}
