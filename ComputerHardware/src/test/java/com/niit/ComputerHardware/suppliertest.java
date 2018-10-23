package com.niit.ComputerHardware;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ComputerHardware.Dao.categoryDao;
import com.niit.ComputerHardware.Dao.supplierDao;
import com.niit.ComputerHardware.model.category;
import com.niit.ComputerHardware.model.supplier;

public class suppliertest 
{
public static void main(String a[])
{
	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
	ctx.scan("com.niit.*");
	ctx.refresh();
	supplier sup=(supplier)ctx.getBean("supplier");
	supplierDao supDao=(supplierDao)ctx.getBean("supplierDao");
	sup.setSupId("123");
	sup.setSupName("abcd");
	sup.setSupPhNo("1234");
	sup.setSupAddress("abcde");
	sup.setSupEmailId("abcd@123");
	sup.setSupPwd("abcd");
	if(supDao.saveorupdate(sup)==true)
	{
		System.out.println("supplier save");
	}
	else
	{
		System.out.println("supplier not saved");
	}
	
	
	
	sup.setSupId("1234");
	sup.setSupName("abcde");
	sup.setSupPhNo("12345");
	sup.setSupAddress("abcdef");
	sup.setSupEmailId("abcd@1234");
	sup.setSupPwd("abcde");
	if(supDao.saveorupdate(sup)==true)
	{
		System.out.println("supplier save");
	}
	else
	{
		System.out.println("supplier not saved");
	}
	
	
	
	sup.setSupId("12345");
	sup.setSupName("abcdef");
	sup.setSupPhNo("123456");
	sup.setSupAddress("abcdef");
	sup.setSupEmailId("abcd@12345");
	sup.setSupPwd("abcdef");
	if(supDao.saveorupdate(sup)==true)
	{
		System.out.println("supplier save");
	}
	else
	{
		System.out.println("supplier not saved");
	}
	
	
	
	sup=supDao.getsupplier("1234");
	if(sup!=null)
	{
		System.out.println(sup.getSupId());
		System.out.println(sup.getSupName());
		System.out.println(sup.getSupPhNo());
		System.out.println(sup.getSupAddress());
		System.out.println(sup.getSupEmailId());
		System.out.println(sup.getSupPwd());
	}
	else
	{
		System.out.println("supplier details not found");
	}
	
	sup=supDao.getsupplier("12345");
	if(sup!=null)
	{
		System.out.println("supplier being deleated");
		if(supDao.delete(sup)==true)
		{
			System.out.println("supplier deleated");
		}
		else
		{
			System.out.println("supplier not deleated");
		}
	}
	else
	{
		System.out.println("supplier details not found");
		
	}
	List<supplier> supplierlist=supDao.supplierlist();
	for(supplier s:supplierlist)
	{
		System.out.println(s.getSupId());
		System.out.println(s.getSupName());
		System.out.println(s.getSupPhNo());
		System.out.println(s.getSupAddress());
		System.out.println(s.getSupEmailId());
		System.out.println(s.getSupPwd());
	}
/*	supplier obj_sup=new supplier();
	obj_sup.setSupId("123");;
	obj_sup.setSupName("rahul");
	obj_sup.setSupAddress("abc");
	obj_sup.setSupPhNo("1233");
	obj_sup.setSupEmailId("abc@123");
	obj_sup.setSupPwd("abcd");
	System.out.println(obj_sup.getSupId());
	System.out.println(obj_sup.getSupName());
	System.out.println(obj_sup.getSupAddress());
	System.out.println(obj_sup.getSupPhNo());
	System.out.println(obj_sup.getSupEmailId());
	System.out.println(obj_sup.getSupPwd());*/
}
}
