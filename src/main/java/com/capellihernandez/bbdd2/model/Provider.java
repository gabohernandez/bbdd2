package com.capellihernandez.bbdd2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "provider")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Provider {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;

	@OneToMany(mappedBy = "provider", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Product> products;
}
