package com.java.springBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBeansApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBeansApplication.class, args);
	}


	@Bean
	public Customer customerOne(@Qualifier("address2") String address) {
		return new Customer("Clara Forester", address);
	}

	@Bean
	public Customer temporary(@Autowired Customer customer) {
		System.out.println(customer);
		return customer;
	}
}
