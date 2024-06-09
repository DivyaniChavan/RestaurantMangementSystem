package com.restaurant.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restaurant.entity.Customer;
import com.restaurant.repository.CustomerRepository;
import com.restaurant.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService 
{
	
	private CustomerRepository cusrepo;

	public CustomerServiceImpl(CustomerRepository cusrepo) 
	{
		super();
		this.cusrepo = cusrepo;
	}

	@Override
	public List<Customer> getAllCustomer() 
	{
		return cusrepo.findAll();
	}

	@Override
	public Customer saveCustomer(Customer customer) 
	{
		return cusrepo.save(customer);
	}

	@Override
	public Customer getCustomerById(int id)
	{
		return cusrepo.findById(id).get();
	}

	@Override
	public void deleteCustomerById(int id) 
	{
		cusrepo.deleteById(id);
		
	}
}
