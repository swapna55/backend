package com.niit.shoppingcart.dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.model.Category;
@EnableTransactionManagement
@Repository(value="categoryDAO")
public class CategoryDAOImpl  {
@Autowired	
private SessionFactory sessionFactory;
public CategoryDAOImpl(SessionFactory sessionFactory){
this.sessionFactory=sessionFactory;
}
@Transactional
public Boolean save(Category category)
{
	try{
		sessionFactory.getCurrentSession().save(category);
		return true;
		
	}catch(HibernateException e){
		e.printStackTrace();
		return false;
	}
}
@Transactional
public Boolean update(Category category)
{
	try{
		sessionFactory.getCurrentSession().update(category);
		return true;
		
	}catch(HibernateException e){
		e.printStackTrace();
		return false;
	}
}
public Boolean delete(Category category)
{
	try{
		sessionFactory.getCurrentSession().delete(category);
		return true;
		
	}catch(HibernateException e){
		e.printStackTrace();
		return false;
	}
}
}



