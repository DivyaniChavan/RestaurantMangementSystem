package com.restaurant.service;

import java.util.List;

import com.restaurant.entity.Breakfast;
import com.restaurant.entity.Dinner;


public interface Dinnerser {
	Dinner SaveDinner(Dinner dinner);
	 List<Dinner>GetAllDinner();
	 Dinner getDinnerById(Long id);
	 
	    public void deleteById(Long id);
}
