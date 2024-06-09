package com.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.restaurant.entity.Admin;
import com.restaurant.entity.Breakfast;
import com.restaurant.entity.Dinner;
import com.restaurant.entity.Lunch;
import com.restaurant.service.impl.Adminserimpl;
import com.restaurant.service.impl.Breakserimpl;
import com.restaurant.service.impl.Dinnerimpl;
import com.restaurant.service.impl.Lunchserimpl;

@Controller
public class AD_controller {
	@Autowired
	private Breakserimpl bser;
	@Autowired
	private Lunchserimpl lser;
	@Autowired
	private Dinnerimpl dser;
	@Autowired
	private Adminserimpl aser;

	public AD_controller(Breakserimpl bser, Lunchserimpl lser, Dinnerimpl dser, Adminserimpl aser) {
		super();
		this.bser = bser;
		this.lser = lser;
		this.dser = dser;
		this.aser = aser;
	}

	@GetMapping("/AddLogin")
	public String Addlogin() {
		return "AddLogin";

	}

	@PostMapping("/adminlogin")
	public String login(@RequestParam(name = "username") String username,
			@RequestParam(name = "password") String password, Model model) {
		Admin admin = aser.username(username);

		if (admin != null && password.equals(admin.getPassword())) {
			// Successful login
			return "Admindash";
		} else {
			// Failed login
			model.addAttribute("error", "Invalid username or password");
			return "AddLogin";
		}
	}

//for adding breakfast
	@GetMapping("/Addbreakfast")
	public String Addbreakfast(Model model) {
		Breakfast bf = new Breakfast();
		model.addAttribute("breakfast", bf);
		return "Breakfast";

	}

	@PostMapping("/saveBreakfast")
	public String SaveBreakfast(@ModelAttribute("breakfast") Breakfast breakfast) {
		bser.SaveHotel(breakfast);
		return "Admindash";

	}

	@GetMapping("/getAllbreakfast")
	public String GetAllhotel(Model model) {
		java.util.List<Breakfast> breakfast = bser.GetAllBreak();
		model.addAttribute("breakfast", breakfast);
		return "Adbreakfast";

	}

	 
    @GetMapping("/deletebreak/{id}")
	public String  deleteById(@PathVariable("id")Integer id) {
		bser.deleteById(id);
		return "redirect:/getAllbreakfast";
	}
    @RequestMapping("/editbreak/{id}")
   	public String editBook(@PathVariable("id") Integer id,Model model) {
   		Breakfast b=bser.getBreakfastById(id);
   		model.addAttribute("breakfast",b);
   		return "Breakfast";
   	}
	@GetMapping("/getAlllunch")
	public String Addlunch(Model model) {
		Lunch lc = new Lunch();
		model.addAttribute("lunch", lc);
		return "Lunch";

	}

	@PostMapping("/savelunch")
	public String Savelunch(@ModelAttribute("lunch") Lunch lunch) {
		lser.SaveLunch(lunch);
		return "Admindash";

	}
	

	@GetMapping("/getadedAlllunch")
	public String GetAlllunch(Model model) {
		java.util.List<Lunch> lunch = lser.GetAlllunch();
		model.addAttribute("lunch", lunch);
		return "Adlunch";

	}
	 @GetMapping("/deletelunch/{id}")
		public String  deletelById(@PathVariable("id")Long id) {
			lser.deleteById(id);
			return "redirect:/getadedAlllunch";
		}
	 @RequestMapping("/editlunch/{id}")
	   	public String editlunch(@PathVariable("id") Long id,Model model) {
	   		Lunch b=lser.getLunchById(id);
	   		model.addAttribute("lunch",b);
	   		return "Lunch";
	   	}

	@GetMapping("/Adddinner")
	public String Adddinner(Model model) {
		Dinner dn = new Dinner();
		model.addAttribute("dinner", dn);
		return "Dinner";

	}

	@PostMapping("/savedinner")
	public String SaveDinner(@ModelAttribute("dinner") Dinner dinner) {
		dser.SaveDinner(dinner);

		return "Admindash";

	}
	 @GetMapping("/deletedinner/{id}")
		public String  deleteById(@PathVariable("id")Long id) {
			dser.deleteById(id);
			return "redirect:/getadedAlldinner";
		}
	 @RequestMapping("/editdinner/{id}")
	   	public String editBook(@PathVariable("id") Long id,Model model) {
	   		Dinner dn=dser.getDinnerById(id);
	   		model.addAttribute("dinner",dn);
	   		return "Dinner";
	   	}

	@GetMapping("/getadedAlldinner")
	public String GetAlldinner(Model model) {
		java.util.List<Dinner> dinner = dser.GetAllDinner();
		model.addAttribute("dinner", dinner);
		return "Addinner";

	}

	@GetMapping("/getpopularbreakfast")
	public String GetAlldinners(Model model) {
		java.util.List<Breakfast> breakfast = bser.GetAllBreak();
		model.addAttribute("breakfast", breakfast);
		return "Userbreakfastmenu";

	}

	@GetMapping("/getpopulardinner")
	public String GetAllldinners(Model model) {
		java.util.List<Dinner> dinner = dser.GetAllDinner();
		model.addAttribute("dinner", dinner);
		return "Dinnermenu";

	}

	@GetMapping("/getpopularlunch")
	public String GetAllllunchs(Model model) {
		java.util.List<Lunch> lunch = lser.GetAlllunch();
		model.addAttribute("lunch", lunch);
		return "Lunchmenu";

	}

}
