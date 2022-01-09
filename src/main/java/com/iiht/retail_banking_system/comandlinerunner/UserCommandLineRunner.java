package com.iiht.retail_banking_system.comandlinerunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.iiht.retail_banking_system.model.UsernameAndPassword;
import com.iiht.retail_banking_system.repository.UsernamePasswordRepo;

@Component
public class UserCommandLineRunner implements CommandLineRunner{

	@Autowired
	UsernamePasswordRepo rep;
	
	@Override
	public void run(String... args) throws Exception {
		rep.save(new UsernameAndPassword(1, "sanjay", "dummy", "employee"));
	}

}
