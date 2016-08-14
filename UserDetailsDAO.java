package com.niit.shoppingcart.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsDAO {
	public Boolean save(UserDetailsDAO userdetails);
	public Boolean update(UserDetailsDAO userdetails);
	public Boolean delete(UserDetailsDAO userdetails);
	public UserDetailsDAO get(String id);
	public List<UserDetailsDAO> list();
	

}
