package com.iiht.retail_banking_system.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	private int accnum;
	private String name;
	private String password;
	private float balance;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(int accnum, String name, String password, float balance) {
		super();
		this.accnum = accnum;
		this.name = name;
		this.password = password;
		this.balance = balance;
	}
	public int getAccnum() {
		return accnum;
	}
	public void setAccnum(int accnum) {
		this.accnum = accnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Customer [accnum=" + accnum + ", name=" + name + ", password=" + password + ", balance=" + balance
				+ "]";
	}
	
}
