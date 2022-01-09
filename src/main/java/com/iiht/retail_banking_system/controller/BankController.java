package com.iiht.retail_banking_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.iiht.retail_banking_system.model.Customer;
import com.iiht.retail_banking_system.service.BankService;

@Controller
public class BankController {

	@Autowired
	BankService bs;

	@RequestMapping("/home")
	public String homepage() {
		return "home";
	}

	@GetMapping("/cus")
	public String customer() {
		return "logincustomer";
	}

	@PostMapping("/validatecustomer")
	public String validateCustomer(@RequestParam String username, @RequestParam String password, ModelMap mm) {
		boolean check = bs.checkCustomerUsernamePassword(username, password);
		if (check) {
			mm.put("username", username);
			return "customer";
		} else
			return "logincustomer";
	}

	@GetMapping("/emp")
	public String employee() {
		return "loginemployee";
	}

	@PostMapping("/validateemployee")
	public String validateEmployee(@RequestParam String username, @RequestParam String password) {

		boolean check = bs.checkUsernamePassword(username, password, "employee");
		if (check)
			return "employee";
		else
			return "loginemployee";
	}

	@GetMapping("/contactus")
	public String contactus() {
		return "contactus";
	}

	@GetMapping("/faqs")
	public String faqs() {
		return "faqs";
	}

	@GetMapping("/add")
	public String add() {
		return "add";
	}

	@PostMapping("/addcustomer")
	public String addCust( Customer cust, ModelMap mm) {
		if (bs.addCustmoer(cust))
			mm.put("sucessfull", "CUSTOMER ADDED SUCCESSFULL!!!");
		return "add";
	}

	@GetMapping("/delete")
	public String delete() {
		return "delete";
	}

	@PostMapping("/deletecustomer")
	public String deleteCust(@RequestParam int accnum, ModelMap mm) {
		if (bs.deleteCustmoer(accnum))
			mm.put("sucessfull", "CUSTOMER DELETED SUCCESSFULL!!!");
		return "delete";
	}

	@GetMapping("/search")
	public String search() {
		return "search";
	}

	@PostMapping("/searchcustomer")
	public String searchCust(@RequestParam int accnum, ModelMap mm) {
		Customer c = bs.searchCustmoer(accnum);
		if (c != null) {
			mm.put("accno", c.getAccnum());
			mm.put("name", c.getName());
			mm.put("balance", c.getBalance());
			return "custdetails";
		} else {
			mm.put("notfound", "NO CUSTOMER WITH SUCH ACCOUN NUMBER");
		}
		return "search";
	}

	@GetMapping("/withdraw")
	public String withdraw() {
		return "withdraw";
	}

	@PostMapping("/afterwithdraw")
	public String withdraw(@RequestParam float amt, ModelMap mm) {
		float wamt = bs.withdraw(amt);
		if (wamt > 0.00f) {
			mm.put("successfull", "Withdrawed sucessfully " + "NEW BALaNCE = " + wamt);
			return "withdraw";
		} else {
			mm.put("successfull", "Amount is Greater Than Balance!!!!");
			return "withdraw";
		}
	}

	@GetMapping("/deposite")
	public String deposite() {
		return "deposite";
	}

	@PostMapping("/afterdeposite")
	public String deposite(@RequestParam int accno, @RequestParam float amt, ModelMap mm) {
		float wamt = bs.deposite(amt, accno);
		if (wamt != 0.00f) {
			mm.put("balance", "NEW BALANCE = " + wamt);
			return "deposite";
		} else {
			mm.put("balance", "NO ACCOUNT WITH THIS ACCOUNT NUMBER "+ accno );
			return "deposite";
		}
	}

	@GetMapping("/balance")
	public String balance(ModelMap mm) {
		mm.put("amount", bs.getBalance());
		return "balance";
	}
	
	@GetMapping("/transfer")
	public String transfer() {
		
		return "transfer";
	}
	
	@PostMapping("/aftertransfer")
	public String aftertransfer(@RequestParam int accnum, @RequestParam float amt, ModelMap mm) {
		String outcome = bs.transfer(amt, accnum);
			mm.put("successfull", outcome);
		return "transfer";
	}
	
	@GetMapping("/custdetails")
	public String details()
	{
		return "search";
	}
	
}
