package com.capellihernandez.bbdd2.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "head")
@Data
public class PurchaseOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal totalAmount;
    private LocalDateTime date;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "purchase_order_item",
            joinColumns = {@JoinColumn(name = "purchase_order_id")},
            inverseJoinColumns = {@JoinColumn(name = "product_id")})
    private List<Product> products;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "delivery_direction_id")
    private DeliveryDirection deliveryDirection;

}
