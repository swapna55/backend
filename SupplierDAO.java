package com.niit.shoppingcart.dao;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.model.Supplier;
@Repository
public interface SupplierDAO {

	public Boolean save(Supplier supplier);
	public Boolean update(Supplier supplier);
	public Boolean delete(Supplier supplier);
	public Supplier get(String id);
	public List<Supplier> list();
	
		// TODO Auto-generated method stub
		
	}
		

	

