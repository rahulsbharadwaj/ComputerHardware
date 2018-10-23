package com.niit.ComputerHardware.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.ComputerHardware.Dao.AuthenticationDao;
import com.niit.ComputerHardware.Dao.BillingDao;
import com.niit.ComputerHardware.Dao.CartDao;
import com.niit.ComputerHardware.Dao.CartItemsDao;
import com.niit.ComputerHardware.Dao.OrderDao;
import com.niit.ComputerHardware.Dao.OrderItemsDao;
import com.niit.ComputerHardware.Dao.PayDao;
import com.niit.ComputerHardware.Dao.ShippingDao;
import com.niit.ComputerHardware.Dao.categoryDao;
import com.niit.ComputerHardware.Dao.productDao;
import com.niit.ComputerHardware.Dao.supplierDao;
import com.niit.ComputerHardware.Dao.userDao;
import com.niit.ComputerHardware.DaoImpl.AuthenticationDaoImpl;
import com.niit.ComputerHardware.DaoImpl.BillingDaoImpl;
import com.niit.ComputerHardware.DaoImpl.CartDaoImpl;
import com.niit.ComputerHardware.DaoImpl.CartItemsDaoImpl;
import com.niit.ComputerHardware.DaoImpl.OrderDaoImpl;
import com.niit.ComputerHardware.DaoImpl.OrderItemsDaoImpl;
import com.niit.ComputerHardware.DaoImpl.PayDaoImpl;
import com.niit.ComputerHardware.DaoImpl.ShippingDaoImpl;
import com.niit.ComputerHardware.DaoImpl.categoryDaoImpl;
import com.niit.ComputerHardware.DaoImpl.productDaoImpl;
import com.niit.ComputerHardware.DaoImpl.supplierDaoImpl;
import com.niit.ComputerHardware.DaoImpl.userDaoImpl;
import com.niit.ComputerHardware.model.Authentication;
import com.niit.ComputerHardware.model.Billing;
import com.niit.ComputerHardware.model.Cart;
import com.niit.ComputerHardware.model.CartItems;
import com.niit.ComputerHardware.model.Order;
import com.niit.ComputerHardware.model.OrderItems;
import com.niit.ComputerHardware.model.Pay;
import com.niit.ComputerHardware.model.Shipping;
import com.niit.ComputerHardware.model.category;
import com.niit.ComputerHardware.model.product;
import com.niit.ComputerHardware.model.supplier;
import com.niit.ComputerHardware.model.user;

@Configuration
@ComponentScan("com.niit.*")
@EnableTransactionManagement
public class ApplicationContaxt 
{
@Bean("dataSource")
public DataSource getDataSource() {
DriverManagerDataSource dataSource = new DriverManagerDataSource();
dataSource.setDriverClassName("org.h2.Driver");
dataSource.setUrl("jdbc:h2:tcp://localhost/~/test/hardware");
dataSource.setUsername("Rahul.s.");
dataSource.setPassword("rahul007");
return dataSource;	
}
private Properties getHibernateProperties() {
Properties properties = new Properties();
properties.put("hibernate.connection.pool_size", "10");
properties.put("hibernate.hbm2ddl.auto", "update");
properties.put("hibernate.show_sql", "true");
properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
return properties;
}
@Autowired
@Bean("sessionFactory")
public SessionFactory getSessionFactory(DataSource dataSource) {
LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
sessionBuilder.addProperties(getHibernateProperties());
sessionBuilder.addAnnotatedClass(category.class);
sessionBuilder.addAnnotatedClass(product.class);
sessionBuilder.addAnnotatedClass(supplier.class);
sessionBuilder.addAnnotatedClass(user.class);
sessionBuilder.addAnnotatedClass(Authentication.class);
sessionBuilder.addAnnotatedClass(Cart.class);
sessionBuilder.addAnnotatedClass(CartItems.class);
sessionBuilder.addAnnotatedClass(Order.class);
sessionBuilder.addAnnotatedClass(OrderItems.class);
sessionBuilder.addAnnotatedClass(Pay.class);
sessionBuilder.addAnnotatedClass(Billing.class);
sessionBuilder.addAnnotatedClass(Shipping.class);






return sessionBuilder.buildSessionFactory();
}
@Autowired
@Bean("transactionManager")
public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
return transactionManager;
}

@Autowired
@Bean("categoryDao")
public categoryDao getcategoryDao(SessionFactory sessionFactory) {
return new categoryDaoImpl(sessionFactory);

}

@Autowired
@Bean("productDao")
public productDao getproductDao(SessionFactory sessionFactory) {
return new productDaoImpl(sessionFactory);
}


@Autowired
@Bean("supplierDao")
public supplierDao getsupplierDao(SessionFactory sessionFactory) {
return new supplierDaoImpl(sessionFactory);

}

@Autowired
@Bean("userDao")
public userDao getuserDao(SessionFactory sessionFactory) {
return new userDaoImpl(sessionFactory);

}

@Autowired
@Bean("authenticationDao")
public AuthenticationDao getAuthenticationDao(SessionFactory sessionFactory) {
return new AuthenticationDaoImpl(sessionFactory);
}
@Autowired
@Bean("cartDao")
public CartDao getCartDao(SessionFactory sessionFactory) {
return new CartDaoImpl(sessionFactory);
}
@Autowired
@Bean("cartItemsDao")
public CartItemsDao getCartItemsDao(SessionFactory sessionFactory) {
return new CartItemsDaoImpl(sessionFactory);
}

@Autowired
@Bean("orderDao")
public OrderDao getOrderDao(SessionFactory sessionFactory) {
return new OrderDaoImpl(sessionFactory);
}

@Autowired
@Bean("orderItemsDao")
public OrderItemsDao getOrderItemsDao(SessionFactory sessionFactory) {
return new OrderItemsDaoImpl(sessionFactory);

}

@Autowired
@Bean("payDao")
public PayDao getPayDao(SessionFactory sessionFactory) {
return new PayDaoImpl(sessionFactory);
}

@Autowired
@Bean("shippingDao")
public ShippingDao getShippingDao(SessionFactory sessionFactory) {
return new ShippingDaoImpl(sessionFactory);
}

@Autowired
@Bean("billingDao")
public BillingDao getBillingDao(SessionFactory sessionFactory) {
return new BillingDaoImpl(sessionFactory);
}




}





