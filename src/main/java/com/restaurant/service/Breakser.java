package com.restaurant.service;

import java.util.List;

import com.restaurant.entity.Breakfast;

public interface Breakser {
	Breakfast SaveHotel( Breakfast breakfast);
	 List<Breakfast>GetAllBreak();
	 
	 Breakfast saveBreakfast(Breakfast breakfast);

	 Breakfast getBreakfastById(Integer id);
	 
	    public void deleteById(Integer id);

	 
}
