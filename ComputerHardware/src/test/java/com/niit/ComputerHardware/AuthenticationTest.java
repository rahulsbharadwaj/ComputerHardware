package com.niit.ComputerHardware;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ComputerHardware.Dao.AuthenticationDao;
import com.niit.ComputerHardware.model.Authentication;

public class AuthenticationTest 
{
public static void main(String a[])
{
	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
	ctx.scan("com.niit.*");
	ctx.refresh();
	Authentication aut=(Authentication)ctx.getBean("authentication");
	AuthenticationDao autDao=(AuthenticationDao)ctx.getBean("authenticationDao");
	
	
	aut.setrId("123");
	aut.setUsername("abcd");
	aut.setRole_name("roll_name");
	if(autDao.saveorupdate(aut)==true)
	{
		System.out.println("Authentication save");
	}
	else
	{
		System.out.println("Authentication not saved");
	}
	
	aut.setrId("124");
	aut.setUsername("abcde");
	aut.setRole_name("roll_name");
	if(autDao.saveorupdate(aut)==true)
	{
		System.out.println("Authentication save");
	}
	else
	{
		System.out.println("Authentication not saved");
	}
	
	
	aut.setrId("125");
	aut.setUsername("abcdef");
	aut.setRole_name("roll_name");
	if(autDao.saveorupdate(aut)==true)
	{
		System.out.println("Authentication save");
	}
	else
	{
		System.out.println("Authentication not saved");
	}
	
	
	aut=autDao.getAuthentication("123");
	if(aut!=null)
	{
		System.out.println(aut.getrId());
		System.out.println(aut.getUsername());
		System.out.println(aut.getRole_name());
	}
	else
	{
		System.out.println("Authentication details not found");
	}
	
	aut=autDao.getAuthentication("124");
	if(aut!=null)
	{
		System.out.println("Authentication being deleated");
		if(autDao.delete(aut)==true)
		{
			System.out.println("Authentication deleated");
		}
		else
		{
			System.out.println("Authentication not deleated");
		}
	}
	else
	{
		System.out.println("Authentication details not found");
		
	}
	
	
	
	List<Authentication> authenticationlist=autDao.Authenticationlist();
	for(Authentication b : authenticationlist)
	{
		System.out.println(b.getrId());
		System.out.println(b.getUsername());
		System.out.println(b.getRole_name());
	}
	
	
	
}
}
