package com.online.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.online.model.Product;
import com.online.service.IProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private IProductService service;
	
	/**
	 * show Register Page
	 * on enter/register URL
	 */
	@GetMapping("/register")
	public String showProducts() {
		return "ProductRegister";
	}
	
	/*
	 * this method will read form data as ModelAttribute.
	 * performs save() operations using service that return PK ID generated.
	 * construct one message and to send UI using model memory
	 */
	@PostMapping("/saveProduct")
	public String saveProducts(@ModelAttribute Product product,Model model) {
		product = service.insertProducts(product);
		String productMessage="Product '"+product.getId()+"' Saved";
		model.addAttribute("productMessage",productMessage);
		return "ProductRegister";
	}
	
	

}
