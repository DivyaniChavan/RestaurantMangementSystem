package com.restaurant.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restaurant.entity.Dinner;
import com.restaurant.repository.Dinnerrepo;
import com.restaurant.service.Dinnerser;
@Service
public class Dinnerimpl implements Dinnerser {
	private Dinnerrepo drep;

	public Dinnerimpl(Dinnerrepo drepo) {
		super();
		this.drep = drepo;
	}

	@Override
	public Dinner SaveDinner(Dinner dinner) {
		// TODO Auto-generated method stub
		return drep.save(dinner);
	}

	@Override
	public List<Dinner> GetAllDinner() {
		// TODO Auto-generated method stub
		return drep.findAll();
	}

	

	@Override
	public void deleteById(Long id) {
		drep.deleteById(id);
		
	}

	@Override
	public Dinner getDinnerById(Long id) {
		// TODO Auto-generated method stub
		return drep.getById(id);
	}

}
