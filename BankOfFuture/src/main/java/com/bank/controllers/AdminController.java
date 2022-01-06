package com.bank.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bank.entities.Client;
import com.bank.entities.Registration;
import com.bank.repositories.AdminRepository;

@Controller
public class AdminController {

	@Autowired
	private AdminRepository adminRepo;

	@GetMapping("/admin-dashboard")
	public String showAdmin() {
		return "admin-dashboard";
	}
	@GetMapping("/edit-profile-admin")
	public String editProAdmin() {
		return "edit-profile-admin";
	}
	
	@GetMapping("/change-pin-admin")
	public String changePinAdmin() {
		return "change-pin-admin";
	}
	
	@GetMapping("/admin/change-pin")
	public String changesPinAdmin() {
		return "change-pin-admin";
	}
	
	@RequestMapping("/admin/edit-profile-admin")
	public String editProfile() {
		return "edit-profile-admin";
	}
	@RequestMapping("/admin/change-pin")
	public String changePin() {
		return "change-pin";
	}
	
	@RequestMapping("/admin/change-password")
	public String changePassword() {
		return "change-password-admin";
	}
	@RequestMapping("/admin/add-new-account")
	public String addNewAcc() {
		return "registration-form";
	}
	@RequestMapping("/admin/loan-management")
	public String manageLoan() {
		return "loan-management";
	}
	@RequestMapping("/admin/news-management")
	public String manageNews() {
		return "news-management";
	}
	@RequestMapping("/admin/message")
	public String meassgeFromAdmin() {
		return "message-admin";
	}
	@RequestMapping("/admin/mobile-banking-management")
	public String manageMobileBanking() {
		return "mobile-banking-management";
	}

	@RequestMapping("/admin/transactions")
	public String checkTransaction() {
		return "transactions";
	}

	/*
	 * @RequestMapping("/admin/request-for-account") public String
	 * aproveApplication() { return "request-for-account"; }
	 */
	
	@PostMapping("/approveProcess")
	public String approveProcess(@ModelAttribute Client client) {
		adminRepo.save(client);
		return "registration-form";
	}
	
	
	
	
}
