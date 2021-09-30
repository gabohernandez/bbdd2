package com.capellihernandez.bbdd2.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Service;

import com.capellihernandez.bbdd2.model.Customer;
import com.capellihernandez.bbdd2.repository.CustomerRepository;

@Service
public class CustomerService {

	private CustomerRepository repository;

	public CustomerService(CustomerRepository repository) {
		this.repository = repository;
	}

	public List<Customer> create(int amount) {
		List<Customer> clients = new ArrayList();
		IntStream.range(0, amount).forEach(e -> clients.add(this.createClient()));
		return StreamSupport.stream(repository.saveAll(clients).spliterator(), false).collect(Collectors.toList());
	}

	private Customer createClient() {
		return new Customer(UtilsService.randomString());
	}

}
