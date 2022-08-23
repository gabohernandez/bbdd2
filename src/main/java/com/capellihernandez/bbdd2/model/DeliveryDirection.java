package com.capellihernandez.bbdd2.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "delivery_direction")
@Data
public class DeliveryDirection {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String street;
	private String number;
	private String floor;

	@OneToOne(mappedBy = "deliveryDirection", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private PurchaseOrder purchaseOrder;

}
