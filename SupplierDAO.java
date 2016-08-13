package com.niit.shoppingcart.dao;

import java.util.List;
import java.util.function.Supplier;

public interface SupplierDAO {

	public Boolean save(Supplier supplier);
	public Boolean update(Supplier supplier);
	public Boolean delete(Supplier supplier);
	public Supplier get(String id);
	public List<Supplier> list();
		

	}

