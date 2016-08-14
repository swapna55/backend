package com.niit.shoppingcart.dao;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.model.Category;


@Repository
public interface CategoryDAO {
		public Boolean save(Category category); 
		public Boolean update(Category category);
		public Boolean delete(Category category);
		public Category get(String id);
		public List<Category> list();
		
		}

	

	

	

	

	



