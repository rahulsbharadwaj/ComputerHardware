package com.niit.ComputerHardware;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ComputerHardware.Dao.CartDao;
import com.niit.ComputerHardware.Dao.CartItemsDao;
import com.niit.ComputerHardware.Dao.productDao;
import com.niit.ComputerHardware.model.Cart;
import com.niit.ComputerHardware.model.CartItems;
import com.niit.ComputerHardware.model.product;

public class CartItemsTest
{
public static void main(String a[])
{
	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
	ctx.scan("com.niit.*");
	ctx.refresh();
	CartItems cat=(CartItems)ctx.getBean("cartItems");
	CartItemsDao catDao=(CartItemsDao)ctx.getBean("cartItemsDao");
	
	Cart car=(Cart)ctx.getBean("cart");
	CartDao carDao=(CartDao)ctx.getBean("cartDao");;

	product pro=(product)ctx.getBean("product");
	productDao proDao=(productDao)ctx.getBean("productDao");
	
	cat.setCartitem_Id("123");
	cat.setPrice(2000.00);	
	
	car=carDao.getCart("123");
	cat.setCart(car);
	
	pro=proDao.getproduct("123");
	cat.setProduct(pro);
	
	if(catDao.saveorupdate(cat)==true)
	{
		System.out.println("CartItems save");
	}
	else
	{
		System.out.println("CartItems not saved");
	}
	
	cat.setCartitem_Id("124");
	cat.setPrice(2000.00);
	
	car=carDao.getCart("123");
	cat.setCart(car);
	
	pro=proDao.getproduct("125");
	cat.setProduct(pro);
	if(catDao.saveorupdate(cat)==true)
	{
		System.out.println("CartItems save");
	}
	else
	{
		System.out.println("CartItems not saved");
	}
	
	
	cat.setCartitem_Id("125");
	cat.setPrice(2000.00);
	
	car=carDao.getCart("123");
	cat.setCart(car);
	
	pro=proDao.getproduct("125");
	cat.setProduct(pro);
	if(catDao.saveorupdate(cat)==true)
	{
		System.out.println("CartItems save");
	}
	else
	{
		System.out.println("CartItems not saved");
	}
	
	
	cat=catDao.getCartItems("123");
	if(cat!=null)
	{
		System.out.println(cat.getCartitem_Id());
		System.out.println(cat.getPrice() );
	}
	else
	{
		System.out.println("CartItems details not found");
	}
	
	
	
	cat=catDao.getCartItems("124");
	if(cat!=null)
	{
		System.out.println("CartItems being deleated");
		if(catDao.delete(cat)==true)
		{
			System.out.println("CartItems deleated");
		}
		else
		{
			System.out.println("CartItems not deleated");
		}
	}
	else
	{
		System.out.println("CartItems details not found");
		
	}
	
	
	
	List<CartItems> CartItemslist=catDao.CartItemslist();
	for(CartItems c:CartItemslist)
	{
		System.out.println(c.getCartitem_Id());
		System.out.println(c.getPrice());
	}
}
}
