package com.iiht.retail_banking_system.service;

import com.iiht.retail_banking_system.model.Customer;

public interface BankService {
	
	boolean checkUsernamePassword(String username, String password, String role);
	
	boolean checkCustomerUsernamePassword(String username, String password);
	
	float getBalance();
	
	boolean addCustmoer(Customer cust);	
	boolean deleteCustmoer(int id);
	Customer searchCustmoer(int id);
	
	float withdraw(float amt) ;
	float deposite(float amt, int accno);
	
	String transfer(float amt, int accno);
}
