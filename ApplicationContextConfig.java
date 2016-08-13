package com.niit.shopping.config;


import java.util.Properties;

import javax.activation.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.h2.engine.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.niit.config")
@EnableTransactionManagement
public class ApplicationContextConfig {
	@Bean(name = "dataSource")
	public BasicDataSource getDataSource() {
BasicDataSource dataSource = new BasicDataSource();
dataSource.setDriverClassName("com.h2.jdbc.Driver");
dataSource.setUrl("jdbc:h2://localhost/~/test");
dataSource.setUsername("sa");
dataSource.setPassword("sa");
	
return dataSource;
	}
private Properties getHibernateProperties() {
Properties properties = new Properties();
properties.put("hibernate.show_sql", "true");
properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
return properties;
}

@Autowired
@Bean(name = "sessionFactory")
public SessionFactory getSessionFactory(javax.sql.DataSource dataSource) {

LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);

sessionBuilder.addAnnotatedClasses(User.class);

return sessionBuilder.buildSessionFactory();
}


@Autowired
@Bean(name="transactionManager")
public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) 
{
HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);


return transactionManager;
}


}
