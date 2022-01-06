package com.bank.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bank.entities.Registration;
import com.bank.repositories.RegistrationRepository;

@Service
public class RegistrationService {
	@Autowired
	private RegistrationRepository regRepo;
	
	public List<Registration> listAll() {
		return regRepo.findAll();
	}

	public void save(Registration registration) {
		regRepo.save(registration);
	}

	public Registration get(long id) {
		return regRepo.findById(id).get();
	}

	public void delete(long id) {
		regRepo.deleteById(id);
	}

	public Registration setPassPin(long longId, Registration registration) {
		Registration registration2 = regRepo.findById(longId).get();
		registration2.setPassword("myName");	
		registration2.setPin("12345");	
		regRepo.save(registration2);
		return null;
		
	}

	
	
}
