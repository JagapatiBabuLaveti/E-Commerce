package com.online.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.model.Product;
import com.online.repository.IProductRepository;
import com.online.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	IProductRepository repo;
	
	@Override
	public Product insertProducts(Product product) {
		return repo.save(product);
	}

}
