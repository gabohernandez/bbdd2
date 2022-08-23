package com.capellihernandez.bbdd2.service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Service;

import com.capellihernandez.bbdd2.model.Provider;
import com.capellihernandez.bbdd2.repository.ProviderRepository;

@Service
public class ProviderService {

	private ProviderRepository repository;

	public ProviderService(ProviderRepository repository) {
		this.repository = repository;
	}

	public List<Provider> create(int amount) {
		List<Provider> providers = new ArrayList();
		IntStream.range(0, amount).forEach(e -> providers.add(this.createProvider()));
		return StreamSupport.stream(repository.saveAll(providers).spliterator(), false).collect(Collectors.toList());
	}

	private Provider createProvider() {
		return Provider.builder().name(UtilsService.randomString()).build();
	}

	public List<Provider> findAll() {
		return StreamSupport.stream(repository.saveAll(repository.findAll()).spliterator(), false).collect(Collectors.toList());
	}
}
