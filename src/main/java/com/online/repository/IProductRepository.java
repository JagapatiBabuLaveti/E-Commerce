package com.online.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.model.Product;

public interface IProductRepository extends JpaRepository<Product, Long> {

}
