package com.niit.shoppingcart.dao;

public class SupplierDAOImpl {
	private String id;
	private String nme;
	private String description;
	private String price;
	public String getId() {
	return id;
	
	
}
	public String getNme() {
		return nme;
	}
	public void setNme(String nme) {
		this.nme = nme;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public void setId(String id) {
		this.id = id;
	}
}