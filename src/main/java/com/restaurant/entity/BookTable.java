package com.restaurant.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BookTable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	public BookTable(String name, String email, String phonenum, LocalDate date, LocalTime time, Integer numberOfPeople,
			String message) {
		super();
		this.name = name;
		this.email = email;
		this.phonenum = phonenum;
		this.date = date;
		this.time = time;
		this.numberOfPeople = numberOfPeople;
		this.message = message;
	}

	private String name;
	private String email;
	private String phonenum;
	private LocalDate date;
	private LocalTime time;
	private Integer numberOfPeople;
	private String message;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public Integer getNumberOfPeople() {
		return numberOfPeople;
	}

	public void setNumberOfPeople(Integer numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
