package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.User;
import com.example.repository.UserRepository;

@Service
public class UserService {

	@Autowired UserRepository userRepository; 
	
	public User getUser(long id) {
		return userRepository.getUser(id);
	}

	public void modifyUser(long id) {
		userRepository.updateUser(id);
	}
	
}
