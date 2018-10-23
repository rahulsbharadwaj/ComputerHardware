package com.niit.ComputerHardware;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ComputerHardware.Dao.categoryDao;
import com.niit.ComputerHardware.model.category;

public class categorytest
{
public static void main(String a[])
{
	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
	ctx.scan("com.niit.*");
	ctx.refresh();
	
	category cat=(category)ctx.getBean("category");
	categoryDao catDao=(categoryDao)ctx.getBean("categoryDao");
	
	cat.setCategoryid("123");
	cat.setCategoryname("abcd");
	
	if(catDao.saveorupdate(cat)==true)
	{
		System.out.println("category save");
	}
	else
	{
		System.out.println("category not saved");
	}
	
	
	cat.setCategoryid("124");
	cat.setCategoryname("abcde");
	if(catDao.saveorupdate(cat)==true)
	{
		System.out.println("category save");
	}
	else
	{
		System.out.println("catagory not saved");
	}
	
	cat.setCategoryid("125");
	cat.setCategoryname("abcdef");
	if(catDao.saveorupdate(cat)==true)
	{
		System.out.println("category save");
	}
	else
	{
		System.out.println("category not saved");
	}
	
	
	
	cat=catDao.getcategory("123");
	if(cat!=null)
	{
		System.out.println(cat.getCategoryid());
		System.out.println(cat.getCategoryname());
	}
	else
	{
		System.out.println("category details not found");
	}
	
	
	
	
	cat=catDao.getcategory("124");
			if(cat!=null)
			{
				System.out.println("Category being deleated");
				if(catDao.delete(cat)==true)
				{
					System.out.println("Category deleated");
				}
				else
				{
					System.out.println("Category not deleated");
				}
			}
			else
			{
				System.out.println("Category details not found");
				
			}
			
			
			
			List<category> catlist=catDao.catlist();
			for(category c:catlist)
			{
				System.out.println(c.getCategoryid());
				System.out.println(c.getCategoryname());
			}
			
	/*category  obj_catagory=new category() ;
			obj_catagory.setCatagoryid("123");
			obj_catagory.setCatagoryname("abcd");
	System.out.println(obj_catagory.getCatagoryid());
	System.out.println(obj_catagory.getCatagoryname());
*/
}
}
