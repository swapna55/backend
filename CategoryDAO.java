package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.Category;

public interface CategoryDAO {
	public interface Categorydao {
		public Boolean save(Category category);
		public Boolean update(Category category);
		public Boolean delete(Category category);
		public Category get(String id);
		public List<Category> list();
		}



}
