package com.restaurant.service;

import java.util.List;

import com.restaurant.entity.Dinner;
import com.restaurant.entity.Lunch;

public interface Lunchser {
	Lunch SaveLunch( Lunch lunch);
	 List<Lunch>GetAlllunch();
	 Lunch getLunchById(Long id);
	 
	    public void deleteById(Long id);
}
