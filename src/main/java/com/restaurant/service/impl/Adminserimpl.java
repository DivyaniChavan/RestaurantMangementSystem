package com.restaurant.service.impl;

import org.springframework.stereotype.Service;

import com.restaurant.entity.Admin;
import com.restaurant.repository.Adminrepo;
import com.restaurant.service.Aminser;
@Service
public class Adminserimpl implements Aminser {
  private Adminrepo arepo;
	public Adminserimpl(Adminrepo arepo) {
	super();
	this.arepo = arepo;
}
	@Override
	public Admin username(String username) {
		
		return  arepo.username(username);
	}

}
