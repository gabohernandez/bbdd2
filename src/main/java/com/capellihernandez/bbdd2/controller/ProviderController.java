package com.capellihernandez.bbdd2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capellihernandez.bbdd2.service.ProviderService;


@RestController
public class ProviderController {
	
	private ProviderService service;
	
	public ProviderController(ProviderService service) {
		this.service = service;
	}
	
	
	@PostMapping(value = "/providers")
	public ResponseEntity createProvider(@RequestBody int amount) {
		try {
			return ResponseEntity.ok(service.create(amount));
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}


	@GetMapping(value = "/providers")
	public ResponseEntity findProviders() {
		try {
			return ResponseEntity.ok(service.findAll());
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
}
