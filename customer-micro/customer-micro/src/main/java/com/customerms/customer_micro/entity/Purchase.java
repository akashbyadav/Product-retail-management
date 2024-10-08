package com.customerms.customer_micro.entity;
import java.math.BigDecimal;

import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;


@Entity
@Table(name="customer_purchases")
@Data
@NoArgsConstructor
public class Purchase {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long purchaseId;

	    private Long customerId;
	    private Long productId;
	    private Integer quantity;
	    private BigDecimal totalPrice;
	    private LocalDateTime purchaseDate;

	  
	    public Purchase(Long customerId, Long productId, Integer quantity, BigDecimal totalPrice) {
	        this.customerId = customerId;
	        this.productId = productId;
	        this.quantity = quantity;
	        this.totalPrice = totalPrice;
	        this.purchaseDate = LocalDateTime.now();
	    }
}
