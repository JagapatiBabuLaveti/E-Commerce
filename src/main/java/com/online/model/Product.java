package com.online.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="product_tab")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="product_seq_gen")
	@SequenceGenerator(name="product_seq_gen",sequenceName = "product_seq",initialValue = 10000,allocationSize = 1)
	@Column(name="product_id_col")
	private Long id;
	
	@Column(name="product_name_col",nullable = false,length=50)
	private String name;
	
	@Column(name="product_description_col",nullable = false,length=50)
	private String description;
	
	@Column(name="product_price_col",nullable = false,length=50)
	private Double price;
	
	@Column(name="product_quantity_col",nullable = false,length=50)
	private Integer quantity;
	
	@Column(name="product_category_col",nullable = false,length=50)
	private String category;
	
	@Column(name="product_brand_col",nullable = false,length=50)
	private String brand;
}
