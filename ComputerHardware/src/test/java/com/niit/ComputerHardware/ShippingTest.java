package com.niit.ComputerHardware;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ComputerHardware.Dao.ShippingDao;
import com.niit.ComputerHardware.Dao.userDao;
import com.niit.ComputerHardware.model.Authentication;
import com.niit.ComputerHardware.model.Shipping;
import com.niit.ComputerHardware.model.user;

public class ShippingTest
{
public static void main(String a[])
{
	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
	ctx.scan("com.niit.*");
	ctx.refresh();
	Shipping shi=(Shipping)ctx.getBean("shipping");
	ShippingDao shiDao=(ShippingDao)ctx.getBean("shippingDao");
	
	user use=(user)ctx.getBean("user");
	userDao useDao=(userDao)ctx.getBean("userDao");
	
	
	shi.setShipId("123");
	shi.setAddress("rajajinagar");
	shi.setCity("Bangalore");
	shi.setState("Karnataka");
	shi.setPincode(560010);
    shi.setCountry("India");
    shi.setPhone(1234567890);
    
    use=useDao.getuser("1234");
	shi.setUser(use);
	
	if(shiDao.saveorupdate(shi)==true)
	{
		System.out.println("Shipping save");
	}
	else
	{
		System.out.println("Shipping not saved");
	}
	
	
	
	shi.setShipId("124");
	shi.setAddress("rajajinagar");
	shi.setCity("Bangalore");
	shi.setState("Karnataka");
	shi.setPincode(560010);
    shi.setCountry("India");
    shi.setPhone(1234567890);
    
    use=useDao.getuser("12345");
  	shi.setUser(use);
    
	if(shiDao.saveorupdate(shi)==true)
	{
		System.out.println("Shipping save");
	}
	else
	{
		System.out.println("Shipping not saved");
	}
	
	shi.setShipId("125");
	shi.setAddress("rajajinagar");
	shi.setCity("Bangalore");
	shi.setState("Karnataka");
	shi.setPincode(560010);
    shi.setCountry("India");
    shi.setPhone(1234567890);
	
    use=useDao.getuser("1234");
  	shi.setUser(use);
    
    if(shiDao.saveorupdate(shi)==true)
	{
		System.out.println("Shipping save");
	}
	else
	{
		System.out.println("Shipping not saved");
	}
	
	shi.setShipId("126");
	shi.setAddress("rajajinagar");
	shi.setCity("Bangalore");
	shi.setState("Karnataka");
	shi.setPincode(560010);
    shi.setCountry("India");
    shi.setPhone(1234567890);
   
    use=useDao.getuser("12345");
  	shi.setUser(use);
	
  	if(shiDao.saveorupdate(shi)==true)
	{
		System.out.println("Shipping save");
	}
	else
	{
		System.out.println("Shipping not saved");
	}
	
	shi=shiDao.getShipping("123");
	if(shi!=null)
	{
		System.out.println(shi.getShipId());
		System.out.println(shi.getAddress());
		System.out.println(shi.getCity());
		System.out.println(shi.getState());
		System.out.println(shi.getPincode());
		System.out.println(shi.getCountry());
		System.out.println(shi.getPhone());
	}
	else
	{
		System.out.println("Shipping details not found");
	}
	
	
	shi=shiDao.getShipping("124");
	if(shi!=null)
	{
		System.out.println("Shipping being deleated");
		if(shiDao.delete(shi)==true)
		{
			System.out.println("Shipping deleated");
		}
		else
		{
			System.out.println("Shipping not deleated");
		}
	}
	else
	{
		System.out.println("Shipping details not found");
		
	}
	
	
	List<Shipping> shippinglist=shiDao.Shippinglist();
	for(Shipping b : shippinglist)
	{
		System.out.println(b.getShipId());
		System.out.println(b.getAddress());
		System.out.println(b.getCity());
		System.out.println(b.getState());
		System.out.println(b.getPincode());
		System.out.println(b.getCountry());
		System.out.println(b.getPhone());
		
	}
	
}
}
