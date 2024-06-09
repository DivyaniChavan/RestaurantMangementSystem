package com.restaurant.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restaurant.entity.Breakfast;
import com.restaurant.repository.Breakrepo;
import com.restaurant.service.Breakser;

@Service
public class Breakserimpl implements Breakser {
	private Breakrepo brepo;

	public Breakserimpl(Breakrepo brepo) {
		super();
		this.brepo = brepo;
	}

	@Override
	public Breakfast SaveHotel(Breakfast breakfast) {
		
		return brepo.save(breakfast);
	}

	@Override
	public List<Breakfast> GetAllBreak() {
		
		return brepo.findAll();
	}

	public Breakfast getBreakfastById(Integer id) {
		return brepo.findById(id).get();
	}

	public Breakfast saveBreakfast(Breakfast existingBreakfast) {
		return brepo.save(existingBreakfast);
		
	}

	@Override
	public void deleteById(Integer id) {
		brepo.deleteById(id);
		
	}

	

}
