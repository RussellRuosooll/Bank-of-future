package com.bank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.entities.Client;

@Repository
public interface AdminRepository extends JpaRepository<Client, Long> {

}
