package com.restaurant.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.entity.User;
import com.restaurant.repository.UserRepository;
import com.restaurant.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userser;

	@Override
	public void saveUser(User user) {
		userser.save(user);
		
	}

	@Override
	public User username(String username) 
	{
		return  userser.username(username);
	}
}