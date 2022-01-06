package com.bank.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.entities.Client;
import com.bank.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepo;

	public List<Client> getUserDatas() {

		return clientRepo.findAll();
	}

	public Client get(long id) {

		return clientRepo.findById(id).get();
	}

	public void delete(long id) {
		clientRepo.deleteById(id);
	}

}
