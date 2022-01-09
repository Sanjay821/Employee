package com.iiht.retail_banking_system.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.retail_banking_system.model.Customer;
import com.iiht.retail_banking_system.model.UsernameAndPassword;
import com.iiht.retail_banking_system.repository.CustomerRepository;
import com.iiht.retail_banking_system.repository.UsernamePasswordRepo;
import com.iiht.retail_banking_system.service.BankService;

@Service
public class BankServiceImpl implements BankService {

	@Autowired
	UsernamePasswordRepo repo;
	@Autowired
	CustomerRepository cusrepo;
	Customer cus;

	@Override
	public boolean checkUsernamePassword(String username, String password, String role) {
		UsernameAndPassword usp = repo.findByUsername(username);
		if (usp.getusername().equals(username) && usp.getPassword().equals(password) && usp.getrole().equals(role))
			return true;
		else
			return false;
	}

	@Override
	public boolean checkCustomerUsernamePassword(String username, String password) {
		cus = cusrepo.findByName(username);
		if (cus.getName().equals(username) && cus.getPassword().equals(password))
			return true;
		else
			return false;
	}

	@Override
	public float getBalance() {
		return cus.getBalance();
	}

	@Override
	public boolean addCustmoer(Customer cust) {
		if (cusrepo.save(cust) != null)
			return true;
		else
			return false;

	}

	@Override
	public boolean deleteCustmoer(int id) {
		cusrepo.deleteById(id) ;
			return true;
	}

	@Override
	public Customer searchCustmoer(int id) {
		return cusrepo.findByAccnum(id);
	}

	@Override
	public float withdraw(float amt) {
		if (amt > cus.getBalance())
			return 0.00f;
		else {
			float newBalance = cus.getBalance() - amt;
			cus.setBalance(newBalance);
			cusrepo.save(cus);
			return newBalance;
		} 
	}

	@Override
	public float deposite(float amt, int accno) {
		cus = cusrepo.findByAccnum(accno);
		if(cus == null)
			return 0.00f;
		float newBalance = cus.getBalance() + amt;
		cus.setBalance(newBalance);
		cusrepo.save(cus);
		return newBalance;
	}

	@Override
	public String transfer(float amt, int accno) {

		Customer tcus = cusrepo.findByAccnum(accno);
		if (tcus == null)
			return "NO ACCOUNT WITH THIS ACCOUNTNUMBER";
		else if(amt > cus.getBalance())
			return "BALANCE LESS THAN AMOUNT ENTERED";
		else {
			float newBalance = cus.getBalance() - amt;
			cus.setBalance(newBalance);
			cusrepo.save(cus);

			float tNewBalance = tcus.getBalance() + amt;
			tcus.setBalance(tNewBalance);
			cusrepo.save(tcus);
			return "TRANSCATION SUCESSFULL";
		}
	}

}
