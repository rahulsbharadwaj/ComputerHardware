package com.niit.ComputerHardware;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ComputerHardware.Dao.BillingDao;
import com.niit.ComputerHardware.Dao.userDao;
import com.niit.ComputerHardware.model.Authentication;
import com.niit.ComputerHardware.model.Billing;
import com.niit.ComputerHardware.model.category;
import com.niit.ComputerHardware.model.user;

public class BillingTest 
{
public static void main(String args[])
{
	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
	ctx.scan("com.niit.*");
	ctx.refresh();
	
	Billing bil=(Billing)ctx.getBean("billing");
	BillingDao bilDao=(BillingDao)ctx.getBean("billingDao");
	
	user use=(user)ctx.getBean("user");
	userDao useDao=(userDao)ctx.getBean("userDao");
	
	
	
	bil.setBillingId("123");
	bil.setBillingName("abcd");
	bil.setBillingAddress("abcd123");
	bil.setBillingPhno("1234");
	
	use=useDao.getuser("1234");
	bil.setUser(use);
	
	
	if(bilDao.saveorupdate(bil)==true)
	{
		System.out.println("Billing save");
	}
	else
	{
		System.out.println("Billing not saved");
	}
	
	bil.setBillingId("124");
	bil.setBillingName("abcde");
	bil.setBillingAddress("abcde123");
	bil.setBillingPhno("12345");
	use=useDao.getuser("1234");
	bil.setUser(use);
	if(bilDao.saveorupdate(bil)==true)
	{
		System.out.println("Billing save");
	}
	else
	{
		System.out.println("Billing not saved");
	}
	
	bil.setBillingId("125");
	bil.setBillingName("abcdef");
	bil.setBillingAddress("abcd1234");
	bil.setBillingPhno("123456");
	use=useDao.getuser("12345");
	bil.setUser(use);
	if(bilDao.saveorupdate(bil)==true)
	{
		System.out.println("Billing save");
	}
	else
	{
		System.out.println("Billing not saved");
	}
	
	bil=bilDao.getBilling("124");
	if(bil!=null)
	{
		System.out.println("Billing being deleated");
		if(bilDao.delete(bil)==true)
		{
			System.out.println("Billing deleated");
		}
		else
		{
			System.out.println("Billing not deleated");
		}
	}
	else
	{
		System.out.println("Billing details not found");
		
	}
	
	
	List<Billing> Billinglist=bilDao.Billinglist();
	for(Billing b : Billinglist)
	{
		System.out.println(b.getBillingId());
		System.out.println(b.getBillingName());
		System.out.println(b.getBillingAddress());
		System.out.println(b.getBillingPhno());
	}
	
	
}
}
