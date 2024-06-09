package com.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurant.entity.Breakfast;
@Repository
public interface Breakrepo extends JpaRepository<Breakfast, Integer>
{
	
}