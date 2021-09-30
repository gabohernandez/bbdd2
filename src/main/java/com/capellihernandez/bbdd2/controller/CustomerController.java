package com.capellihernandez.bbdd2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capellihernandez.bbdd2.service.CustomerService;


@RestController
public class CustomerController {
	
	private CustomerService service; 
	
	public CustomerController(CustomerService service) {
		this.service = service;
	}
	
	
	@PostMapping(value = "/customers")
	public ResponseEntity createCustomer(@RequestBody int amount) {
		try {
			return ResponseEntity.ok(service.create(amount));
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

}
