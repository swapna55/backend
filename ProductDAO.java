package com.niit.shoppingcart.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

	@Repository
	public interface ProductDAO<Product> {
	public Boolean save(Product product);
	public Boolean update(Product product);
	public Boolean delete(Product product);
	public Product get(String id);
	public List<Product> list();
		

	}
