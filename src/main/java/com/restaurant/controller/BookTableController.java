package com.restaurant.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.restaurant.entity.BookTable;
import com.restaurant.service.BookTableService;

public class BookTableController 
{
	private BookTableService bookser;
	
	 public BookTableController(BookTableService bookser) 
	 {
		super();
		this.bookser = bookser;
		
	 }
			//Save record into database
			@PostMapping("/booktable/save")
			public String saveBookTable(@ModelAttribute("BookTable") BookTable booktable)
			{
				bookser.saveBookTable(booktable);
				
				return "redirect:/index";
				
			}
}
