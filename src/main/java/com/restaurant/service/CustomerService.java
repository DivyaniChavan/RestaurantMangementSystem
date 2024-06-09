package com.restaurant.service;

import java.util.List;

import com.restaurant.entity.Customer;

public interface CustomerService 
{
	List<Customer> getAllCustomer();

	Customer saveCustomer(Customer customer);

	Customer getCustomerById(int id);
	
	void deleteCustomerById(int id);
}
