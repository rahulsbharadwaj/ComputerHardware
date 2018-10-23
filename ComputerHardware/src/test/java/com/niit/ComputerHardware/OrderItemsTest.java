package com.niit.ComputerHardware;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ComputerHardware.Dao.OrderDao;
import com.niit.ComputerHardware.Dao.OrderItemsDao;
import com.niit.ComputerHardware.model.Order;
import com.niit.ComputerHardware.model.OrderItems;

public class OrderItemsTest
{
public static void main(String a[])
{
	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
	ctx.scan("com.niit.*");
	ctx.refresh();
	OrderItems ordi=(OrderItems)ctx.getBean("orderItems");
	OrderItemsDao ordiDao=(OrderItemsDao)ctx.getBean("orderItemsDao");
	
	Order ord=(Order)ctx.getBean("order");
	OrderDao ordDao=(OrderDao)ctx.getBean("orderDao");
	
	ordi.setOrderitem_Id("123");
	ordi.setProduct_Id("123");
	
	ord=ordDao.getOrder("123");
	ordi.setOrder(ord);
	
	if(ordiDao.saveorupdate(ordi)==true)
	{
		System.out.println("OrderItems save");
	}
	else
	{
		System.out.println("OrderItems not saved");
	}
	
	ordi.setOrderitem_Id("124");
	ordi.setProduct_Id("124");
	
	ord=ordDao.getOrder("123");
	ordi.setOrder(ord);
	
	if(ordiDao.saveorupdate(ordi)==true)
	{
		System.out.println("OrderItems save");
	}
	else
	{
		System.out.println("OrderItems not saved");
	}
	
	
	
	ordi.setOrderitem_Id("125");
	ordi.setProduct_Id("125");
	
	ord=ordDao.getOrder("125");
	ordi.setOrder(ord);
	
	if(ordiDao.saveorupdate(ordi)==true)
	{
		System.out.println("OrderItems save");
	}
	else
	{
		System.out.println("OrderItems not saved");
	}
	
	ordi=ordiDao.getOrderItems("123");
	if(ordi!=null)
	{
		System.out.println(ordi.getOrderitem_Id());
		System.out.println(ordi.getProduct_Id());
		
	}
	else
	{
		System.out.println("OrderItems details not found");
	}
	
	
	
	ordi=ordiDao.getOrderItems("124");
	if(ordi!=null)
	{
		System.out.println("OrderItems being deleated");
		if(ordiDao.delete(ordi)==true)
		{
			System.out.println("OrderItems deleated");
		}
		else
		{
			System.out.println("OrderItems not deleated");
		}
	}
	else
	{
		System.out.println("OrderItems details not found");
		
	}
	
	
	List<OrderItems> orderitemslist=ordiDao.OrderItemslist();
	for(OrderItems b : orderitemslist)
	{
		System.out.println(b.getOrderitem_Id());
		System.out.println(b.getProduct_Id());
		
	}
	
	
}
}
