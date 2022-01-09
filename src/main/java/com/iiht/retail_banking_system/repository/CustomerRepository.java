package com.iiht.retail_banking_system.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.iiht.retail_banking_system.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	Customer  findByName(String name);
	Customer findByAccnum(int accnum);
	
}
