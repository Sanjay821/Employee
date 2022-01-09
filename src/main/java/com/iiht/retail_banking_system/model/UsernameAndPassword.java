package com.iiht.retail_banking_system.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UsernameAndPassword {

	@Id
	private int id;
	
	private String username;
	private String Password;
	private String role;

	public UsernameAndPassword() {
		// TODO Auto-generated constructor stub
	}
	public UsernameAndPassword(String username, String password, String role) {
		this.username = username;
		this.Password = password;
		this.role = role;
	}
	public UsernameAndPassword(int id, String username, String password, String role) {
		super();
		this.id = id;
		this.username = username;
		Password = password;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public String getusername() {
		return username;
	}

	public void setusername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getrole() {
		return role;
	}

	public void setrole(String role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "UsernameAndPassword [id=" + id + ", username=" + username + ", Password=" + Password + ", role=" + role
				+ "]";
	}


}
