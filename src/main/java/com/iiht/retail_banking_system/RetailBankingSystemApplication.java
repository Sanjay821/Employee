package com.iiht.retail_banking_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.iiht.retail_banking_system")
public class RetailBankingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetailBankingSystemApplication.class, args);
	}

}
