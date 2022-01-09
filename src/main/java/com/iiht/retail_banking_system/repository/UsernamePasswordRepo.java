package com.iiht.retail_banking_system.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.iiht.retail_banking_system.model.UsernameAndPassword;

public interface UsernamePasswordRepo extends JpaRepository<UsernameAndPassword, Integer> {

	UsernameAndPassword findByUsername(String Username);
}
