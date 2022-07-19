package com.example.demo.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Product;
import com.example.demo.Repository.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping("/add")
	public Product save(@RequestBody Product product)
	{
		return productRepository.save(product);
	}
	
	@GetMapping("/get")
	
	public List<Product> findAList(){
		return productRepository.findAll();
		
	}
	@GetMapping("/product/{id}")
	public Optional<Product> findById(@PathVariable int id)
	{
		return productRepository.findById(id);
	}
}
