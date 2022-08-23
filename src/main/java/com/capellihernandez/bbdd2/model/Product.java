package com.capellihernandez.bbdd2.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "product")
@Data
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private BigDecimal price;

	@ManyToOne()
	@JoinColumn(name = "provider_id")
	private Provider provider;

}
