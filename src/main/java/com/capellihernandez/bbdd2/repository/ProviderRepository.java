package com.capellihernandez.bbdd2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capellihernandez.bbdd2.model.Provider;

@Repository
public interface ProviderRepository extends CrudRepository<Provider, Long> {

}
