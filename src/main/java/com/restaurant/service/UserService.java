package com.restaurant.service;

import com.restaurant.entity.User;

public interface UserService 
{
	User username(String username);

	void saveUser(User user);
	
}