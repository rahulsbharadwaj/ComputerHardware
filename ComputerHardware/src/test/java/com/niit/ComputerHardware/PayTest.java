package com.niit.ComputerHardware;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ComputerHardware.Dao. PayDao;
import com.niit.ComputerHardware.model. Pay;

public class PayTest 
{
public static void main(String a[])
{
	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
	ctx.scan("com.niit.*");
	ctx.refresh();
	 Pay catt=( Pay)ctx.getBean("pay");
	 PayDao cattDao=( PayDao)ctx.getBean("payDao");
	 
	    catt.setPay_Id("123");;
		catt.setPay_Method("cash");
		catt.setStatus("confermed");
		if(cattDao.saveorupdate(catt)==true)
		{
			System.out.println("Pay save");
		}
		else
		{
			System.out.println("Pay not saved");
		}
	 
	    catt.setPay_Id("124");;
		catt.setPay_Method("cash");
		catt.setStatus("confermed");
		if(cattDao.saveorupdate(catt)==true)
		{
			System.out.println("Pay save");
		}
		else
		{
			System.out.println("Pay not saved");
		}
	
		
		
		
		
		    catt.setPay_Id("125");;
			catt.setPay_Method("cash");
			catt.setStatus("confermed");
			if(cattDao.saveorupdate(catt)==true)
			{
				System.out.println("Pay save");
			}
			else
			{
				System.out.println("Pay not saved");
			}
		
			
			
			
			    catt.setPay_Id("126");;
				catt.setPay_Method("cash");
				catt.setStatus("confermed");
				if(cattDao.saveorupdate(catt)==true)
				{
					System.out.println("Pay save");
				}
				else
				{
					System.out.println("Pay not saved");
				}
				
				 
				catt=cattDao.getPay("123");
				if(catt!=null)
				{
					System.out.println(catt.getPay_Id());
					System.out.println(catt.getPay_Method());
					System.out.println(catt.getStatus());
				}
				else
				{
					System.out.println("Pay details not found");
				}
				
				
				catt=cattDao.getPay("124");
				if(catt!=null)
				{
					System.out.println("Pay being deleated");
					if(cattDao.delete(catt)==true)
					{
						System.out.println("Pay deleated");
					}
					else
					{
						System.out.println("Pay not deleated");
					}
				}
				else
				{
					System.out.println("Pay details not found");
					
				}
				
				
				List<Pay> paylist=cattDao.Paylist();
				for(Pay b : paylist)
				{
					System.out.println(b.getPay_Id());
					System.out.println(b.getPay_Method());
					System.out.println(b.getStatus());
				}
				
}
}
