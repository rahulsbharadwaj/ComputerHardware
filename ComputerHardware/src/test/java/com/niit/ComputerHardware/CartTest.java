package com.niit.ComputerHardware;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ComputerHardware.Dao.CartDao;
import com.niit.ComputerHardware.model.Cart;

public class CartTest
{
public static void main(String a[])
{
	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
	ctx.scan("com.niit.*");
	ctx.refresh();
	
	Cart car=(Cart)ctx.getBean("cart");
	CartDao carDao=(CartDao)ctx.getBean("cartDao");
	
	
	
	
	car.setCart_Id("123");
	car.setTotal_items(3);
	car.setGrand_total(200.00);
	if(carDao.saveorupdate(car)==true)
	{
		System.out.println("Cart save");
	}
	else
	{
		System.out.println("Cart not saved");
	}
	

	car.setCart_Id("124");
	car.setTotal_items(4);
	car.setGrand_total(400.00);
	if(carDao.saveorupdate(car)==true)
	{
		System.out.println("Cart save");
	}
	else
	{
		System.out.println("Cart not saved");
	}
	
	

	car.setCart_Id("125");
	car.setTotal_items(5);
	car.setGrand_total(500.00);
	if(carDao.saveorupdate(car)==true)
	{
		System.out.println("Cart save");
	}
	else
	{
		System.out.println("Cart not saved");
	}
	
	
	
	car=carDao.getCart("124");
	if(car!=null)
	{
		System.out.println(" Cart being deleated");
		if(carDao.delete(car)==true)
		{
			System.out.println(" Cart deleated");
		}
		else
		{
			System.out.println(" Cart not deleated");
		}
	}
	else
	{
		System.out.println(" Cart details not found");
		
	}
	
	List<Cart> Cartlist=carDao.Cartlist();
	for(Cart b : Cartlist)
	{
		System.out.println(b.getCart_Id());
		System.out.println(b.getTotal_items());
		System.out.println(b.getGrand_total());
	}
	
}	
}
