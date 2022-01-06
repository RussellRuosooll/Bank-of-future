package com.bank.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bank.entities.Registration;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {

	public List<Registration> findByStatus(String status);

	
	

}
