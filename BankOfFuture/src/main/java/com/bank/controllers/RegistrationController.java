package com.bank.controllers;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bank.entities.Client;
import com.bank.entities.Registration;
import com.bank.repositories.RegistrationRepository;
import com.bank.services.RegistrationService;

@Controller
public class RegistrationController {
	@Autowired
	private RegistrationRepository regRepo;

	@RequestMapping("/registration-form")
	public String registerAccount() {
		return "registration-form";
	}

	@RequestMapping("/set-password-pin")
	public String setPassAndPin() {
		return "set-password-pin";
	}

	@PostMapping("/registrationProcess")
	public String registrationProcess(@ModelAttribute Registration registration) {
		regRepo.save(registration);
		return "set-password-pin";
	}

	@GetMapping("/client-profile")
	public String Showdeatils(Model model) {
		Registration userDetails = regRepo.findById((long) 16).get();
		model.addAttribute("userDetails", userDetails);
		return "client-profile";
	}

	@RequestMapping("/request-for-account")
	public String requestForAcc(Model model) {
		return "request-for-account";
	}

	@RequestMapping("/give-account-number")
	public String giveAccno(Model model) {
		return "give-account-number";
	}

	@RequestMapping("/admin/request-for-account")
	public String requestForAccount(Model model) {
		List<Registration> requests = regRepo.findByStatus("pending");
		
		model.addAttribute("requests", requests);
		return "request-for-account";
	}

	@RequestMapping("/admin/rejected-application")
	public String rejectApplication(Model model) {
		List<Registration> requests = regRepo.findByStatus("rejected");
		model.addAttribute("requests", requests);
		return "rejected-application";
	}

	@RequestMapping("/approve/{id}")
	public ModelAndView showEditStudentPage(@PathVariable(name = "id") long id,
			@ModelAttribute Registration registration) {
		ModelAndView mav = new ModelAndView("give-account-number");
		mav.addObject("id", id);
		return mav;
	}

	@PostMapping("/updateAccNo")
	public String updateAccNo(@RequestParam("id") long id, @RequestParam("accNo") long accNo) {
		Registration registration = regRepo.findById(id).get();
		registration.setAccNo(accNo);
		registration.setStatus("approved");
		regRepo.save(registration);
		return "redirect:/admin/request-for-account";
	}

	@PostMapping("/setPassPin")
	public String setPassPin(@RequestParam("id") long id, @RequestParam("password") long password, @RequestParam("pin") long pin) {
		Registration registration = regRepo.findById(id).get();
		registration.setAccNo(password);
		registration.setAccNo(pin);
		regRepo.save(registration);
		return "client-profile";
	}

	@RequestMapping("/reject/{id}")
	public String deletestudent(@PathVariable(name = "id") long id) {
		Registration registration = regRepo.findById(id).get();
//		Registration registration2 = registration.get();
		registration.setStatus("rejected");
		regRepo.save(registration);
		return "redirect:/admin/request-for-account";
	}

	@RequestMapping("/admin/client-account-details")
	public String clientAccDetails(Model model) {
		model.addAttribute("approvedAcc", regRepo.findByStatus("approved"));
		return "client-account-details";
	}
	
	
	


}
