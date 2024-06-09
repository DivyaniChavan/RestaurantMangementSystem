package com.restaurant.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Admin {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id ;
		private String username;
		public Admin() {
			super();
		}
		public Admin(long id, String username, String password, String email) {
			super();
			this.id = id;
			this.username = username;
			this.Password = password;
			this.email = email;
			
		}
		@OneToMany(mappedBy = "admin", cascade = CascadeType.ALL)
	    
		
		
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		private String Password;
		private String email;


}
