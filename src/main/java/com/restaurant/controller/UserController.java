package com.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.restaurant.entity.User;
import com.restaurant.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/login")
	public String showLoginForm() {
		return "login";
	}

	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}

	@PostMapping("/register")
	public String processRegistration(@ModelAttribute("user") @Validated User user, BindingResult result) {
		if (result.hasErrors()) {
			return "register";
		}

		userService.saveUser(user);
		return "redirect:/login?success";
	}

	@GetMapping("/UserDash")
	public String UserDash() {
		return "UserDash";
	}

	@GetMapping("/UserLogin")
	public String UserLogin() {
		return "UserLogin";
	}

	@GetMapping("/usersignup")
	public String usersignup() {
		return "usersignup";

	}

	/*
	 * @GetMapping("/login") public String login() { return "login"; }
	 * 
	 * @PostMapping("/login") public String login(@RequestParam(name = "username")
	 * String username,
	 * 
	 * @RequestParam(name = "password") String password, Model model) { User user =
	 * userser.findByUsername(username);
	 * 
	 * if (user != null && password.equals(user.getPassword())) { // Successful
	 * login return "Userdash"; } else { // Failed login model.addAttribute("error",
	 * "Invalid username or password"); return "login"; } }
	 */
}