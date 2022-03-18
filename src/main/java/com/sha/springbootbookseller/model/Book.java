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
@Table(name = "books")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "title", nullable = false, length = 100)
	private String title;
	
	@Column(name = "description", nullable = false, length = 1000)
	private String description;
	
	@Column(name = "author", nullable = false, length = 100)
	private String author;
	
	@Column(name = "price", nullable = false)
	private Double price;
	
	@Column(name = "create_time", nullable = false)
	private LocalDateTime createTime;
}
