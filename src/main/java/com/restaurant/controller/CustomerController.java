package com.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.restaurant.entity.Customer;
import com.restaurant.service.CustomerService;

@Controller
public class CustomerController 
{
	private CustomerService custser;
	
	 public CustomerController(CustomerService custser) 
	 {
		super();
		this.custser = custser;
		
	 }
    
	 
	 @GetMapping("/home")
	 public String Home() {
		return "Home";
		 
	 }
	//Get All record
	 @GetMapping("/GetCust")
	 public String listCustomer(Model mod)
	 {
		mod.addAttribute("customer",custser.getAllCustomer());
		return "customer";
	 }
	 
	//access Insert Form 
		@GetMapping("/Cust/New")
		public String CreateCustomer(Model mod)
		{
			Customer customer =new Customer();
			mod.addAttribute("customer", customer);
			return "create_customer";
			
		}
		
		//Save record into database
		@PostMapping("/Cust/save")
		public String saveCustomer(@ModelAttribute("customer") Customer customer)
		{
			custser.saveCustomer(customer);
			
			return "redirect:/menu";
			
		}
		
		//Get data by id
		@GetMapping("/Cust/edit/{id}")
		public String editCustomerForm(@PathVariable int id , Model mod)
		{
			mod.addAttribute("customer", custser.getCustomerById(id));
			return "edit_customer";
			
		}
		// Update data 
		@PostMapping("/Cust/update/{id}")
		public String updateCustomer(@PathVariable int id , @ModelAttribute("customer") Customer customer , Model mod)
		{
			Customer existingCustomer = custser.getCustomerById(id);
			existingCustomer.setId(id);
			existingCustomer.setFirstName(customer.getFirstName());
			existingCustomer.setLastName(customer.getLastName());
			existingCustomer.setEmail(customer.getEmail());
			existingCustomer.setPhonenumber(customer.getPhonenumber());
			existingCustomer.setPassword(customer.getPassword());
			custser.saveCustomer(existingCustomer);
			return "redirect:/GetCust";
		}
		//Delete Data by id
		@GetMapping("/Cust/delete/{id}")
		public String deleteCustomer(@PathVariable int id )
		{
			custser.deleteCustomerById(id);
			return "redirect:/GetCust";
			
		}
		@GetMapping("/index")
		public String index()
		{
			return "index";
			
		}
		@GetMapping("/about")
		public String about()
		{
			return "about";
		}
		
		@GetMapping("/signin")
		public String signin()
		{
			return "signin";
		}
		@GetMapping("/SignInPage")
		public String SignInPage()
		{
			return "SignInPage";
		}
		@GetMapping("/menu")
		public String menu()
		{
			return "menu";
		}
		@GetMapping("/gallery")
		public String gallery()
		{
			return "gallery";
		}
		@GetMapping("/events")
		public String events()
		{
			return "events";
		}
		@GetMapping("/booktable")
		public String booktable()
		{
			return "booktable";
		}
		@GetMapping("/contact")
		public String contact()
		{
			return "contact";
		}
		
}