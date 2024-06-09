package com.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.entity.Admin;

public interface Adminrepo extends JpaRepository<Admin, Long>{
	Admin username(String username);

}
