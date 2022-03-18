package com.sha.springbootbookseller.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "purchase_history")
public class PurchaseHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "user_id", nullable = false)
	private Long userId;
	
	@Column(name = "book_id", nullable = false)
	private Long bookId;
	
	@Column(name = "price", nullable = false)
	private Double price;
	
	@Column(name = "purchase_time", nullable = false)
	private LocalDateTime purchaseTime;
}
