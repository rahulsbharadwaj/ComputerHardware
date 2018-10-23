package com.niit.ComputerHardware;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ComputerHardware.Dao.categoryDao;
import com.niit.ComputerHardware.Dao.userDao;
import com.niit.ComputerHardware.model.category;
import com.niit.ComputerHardware.model.user;

public class usertest 
{
public static void main(String a[])
{
	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
	ctx.scan("com.niit.*");
	ctx.refresh();
	user use=(user)ctx.getBean("user");
	userDao useDao=(userDao)ctx.getBean("userDao");
	
	
	use.setUserId("123");
	use.setUserName("abcd");
	use.setUserPhNo("12345");
	use.setUserAddress("abcdefgh");
	use.setUserEmailId("abc@123");
	use.setUserPwd("1234abcd");
	if(useDao.saveorupdate(use)==true)
	{
		System.out.println("user save");
	}
	else
	{
		System.out.println("user not saved");
	}
	
	
	
	use.setUserId("1234");
	use.setUserName("abcde");
	use.setUserPhNo("123456");
	use.setUserAddress("abcdefgh");
	use.setUserEmailId("abc@1234");
	use.setUserPwd("1234abcde");
	if(useDao.saveorupdate(use)==true)
	{
		System.out.println("user save");
	}
	else
	{
		System.out.println("user not saved");
	}
	
	use.setUserId("12345");
	use.setUserName("abcdef");
	use.setUserPhNo("1234567");
	use.setUserAddress("abcdefgh6");
	use.setUserEmailId("abc@12345");
	use.setUserPwd("1234abcdef");
	if(useDao.saveorupdate(use)==true)
	{
		System.out.println("user save");
	}
	else
	{
		System.out.println("user not saved");
	}
	
	
	use=useDao.getuser("123");
	if(use!=null)
	{
		System.out.println(use.getUserId());
		System.out.println(use.getUserName());
		System.out.println(use.getUserPhNo());
		System.out.println(use.getUserAddress());
		System.out.println(use.getUserEmailId());
		System.out.println(use.getUserPwd());
	}
	else
	{
		System.out.println("user details not found");
	}
	
	
	
	use=useDao.getuser("123");
	if(use!=null)
	{
		System.out.println("user being deleated");
		if(useDao.delete(use)==true)
		{
			System.out.println("user deleated");
		}
		else
		{
			System.out.println("user not deleated");
		}
	}
	else
	{
		System.out.println("user details not found");
		
	}
	List<user> userlist=useDao.userlist();
	for(user u:userlist)
	{
		System.out.println(u.getUserId());
		System.out.println(u.getUserName());
		System.out.println(u.getUserPhNo());
		System.out.println(u.getUserAddress());
		System.out.println(u.getUserEmailId());
		System.out.println(u.getUserPwd());
	}
	
	
	
	
	
	
	
	
	
	/*
	user obj_user= new user();
	obj_user.setUserId("123");
	obj_user.setUserName("rahul");
	obj_user.setUserAddress("asd");
	obj_user.setUserPhNo("1234");
	obj_user.setUserEmailId("abc@123");
	obj_user.setUserPwd("asddf");
	System.out.println(obj_user.getUserId());
	System.out.println(obj_user.getUserName());
	System.out.println(obj_user.getUserAddress());
	System.out.println(obj_user.getUserPhNo());
	System.out.println(obj_user.getUserEmailId());
	System.out.println(obj_user.getUserPwd());

*/
}
}
