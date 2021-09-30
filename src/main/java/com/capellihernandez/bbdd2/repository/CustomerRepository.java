package com.capellihernandez.bbdd2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capellihernandez.bbdd2.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
