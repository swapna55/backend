package com.niit.shoppingcart.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.model.Category;
	@Repository
	public interface ProductDAO<Product> {
	public Boolean save(Product product);
	public Boolean update(Product product);
	public Boolean delete(Product product);
	public Category get(String id);
	public List<Product> list();
		

	}
