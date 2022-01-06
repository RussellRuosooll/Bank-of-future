package com.bank.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bank.entities.Registration;
import com.bank.repositories.ClientRepository;
import com.bank.services.ClientService;

@Controller
public class RestControllers {
	
	@Autowired
	ClientRepository userRepository;
	@Autowired
	ClientService userService;

//Controllers for Admin Panels

	@RequestMapping("/admin/add-new-user-account")
	public String addUser() {
		return "registration-form";
	}
	@RequestMapping("/admin/card-management")
	public String manageCard() {
		return "card-management";
	}
//	@RequestMapping("/admin/user-account-details")
//	public String checkUserDetails() {
//		return "user-account-details";
//	}
	
	
	//remove
//	@RequestMapping("/delete/{id}")
//	public String deleteUser(@PathVariable(name = "id") long id) {
//		userService.delete(id);
//		return "redirect:/user-account-details";
//	}
//	
//	
	
	
//Controller for both panels
	@RequestMapping("/loginPage")
	public String loginTo() {
		return "loginPage";
	}	
	
}
