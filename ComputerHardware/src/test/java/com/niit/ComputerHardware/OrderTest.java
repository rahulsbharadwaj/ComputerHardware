package com.niit.ComputerHardware;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ComputerHardware.Dao.BillingDao;
import com.niit.ComputerHardware.Dao.OrderDao;
import com.niit.ComputerHardware.Dao.PayDao;
import com.niit.ComputerHardware.Dao.ShippingDao;
import com.niit.ComputerHardware.Dao.userDao;
import com.niit.ComputerHardware.model.Billing;
import com.niit.ComputerHardware.model.Order;
import com.niit.ComputerHardware.model.Pay;
import com.niit.ComputerHardware.model.Shipping;
import com.niit.ComputerHardware.model.user;

public class OrderTest
{
public static void main(String a[])
{
	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
	ctx.scan("com.niit.*");
	ctx.refresh();
	Order ord=(Order)ctx.getBean("order");
	OrderDao ordDao=(OrderDao)ctx.getBean("orderDao");
	
	Billing bil=(Billing)ctx.getBean("billing");
	BillingDao bilDao=(BillingDao)ctx.getBean("billingDao");
	
	Pay catt=( Pay)ctx.getBean("pay");
	PayDao cattDao=( PayDao)ctx.getBean("payDao");
	
	Shipping shi=(Shipping)ctx.getBean("shipping");
	ShippingDao shiDao=(ShippingDao)ctx.getBean("shippingDao");
	
	user use=(user)ctx.getBean("user");
	userDao useDao=(userDao)ctx.getBean("userDao");
	
	
	ord.setOrder_Id("123");
	ord.setOrder_Date("10-20-18");
	ord.setOrder_Time("9:00:00am");
	ord.setGrand_Total(2000.00);
	
	bil=bilDao.getBilling("123");
	ord.setBilling(bil);
	
	catt=cattDao.getPay("123");
	ord.setPay(catt);
	
	shi=shiDao.getShipping("123");
	ord.setShipping(shi);
	
	use=useDao.getuser("1234");
	ord.setUser(use);
	if(ordDao.saveorupdate(ord)==true)
	{
		System.out.println("Order save");
	}
	else
	{
		System.out.println("Order not saved");
	}
	
	
	
	ord.setOrder_Id("124");
	ord.setOrder_Date("14-20-18");
	ord.setOrder_Time("8:00:00am");
	ord.setGrand_Total(2000.00);
	
	bil=bilDao.getBilling("125");
	ord.setBilling(bil);
	
	catt=cattDao.getPay("123");
	ord.setPay(catt);
	
	shi=shiDao.getShipping("125");
	ord.setShipping(shi);
	
	use=useDao.getuser("12345");
	ord.setUser(use);
	if(ordDao.saveorupdate(ord)==true)
	{
		System.out.println("Order save");
	}
	else
	{
		System.out.println("Order not saved");
	}
	
	
	
	
	ord.setOrder_Id("125");
	ord.setOrder_Date("04-20-18");
	ord.setOrder_Time("9:00:00am");
	ord.setGrand_Total(2000.00);
	
	bil=bilDao.getBilling("123");
	ord.setBilling(bil);
	
	catt=cattDao.getPay("126");
	ord.setPay(catt);
	
	shi=shiDao.getShipping("126");
	ord.setShipping(shi);
	
	use=useDao.getuser("1234");
	ord.setUser(use);
	if(ordDao.saveorupdate(ord)==true)
	{
		System.out.println("Order save");
	}
	else
	{
		System.out.println("Order not saved");
	}
	
	
	
	ord=ordDao.getOrder("123");
	if(ord!=null)
	{
		System.out.println(ord.getOrder_Id());
		System.out.println(ord.getOrder_Time());
		System.out.println(ord.getOrder_Date());
	}
	else
	{
		System.out.println("Order details not found");
	}
	
	
	ord=ordDao.getOrder("124");
	if(ord!=null)
	{
		System.out.println("Order being deleated");
		if(ordDao.delete(ord)==true)
		{
			System.out.println("Order deleated");
		}
		else
		{
			System.out.println("Order not deleated");
		}
	}
	else
	{
		System.out.println("Order details not found");
		
	}
	
	

	List<Order> orderlist=ordDao.Orderlist();
	for(Order b : orderlist)
	{
		System.out.println(b.getOrder_Id());
		System.out.println(b.getOrder_Time());
		System.out.println(b.getOrder_Date());
	}
	
	
}
}
