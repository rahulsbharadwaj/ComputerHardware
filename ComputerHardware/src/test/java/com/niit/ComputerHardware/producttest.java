package com.niit.ComputerHardware;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ComputerHardware.Dao.categoryDao;
import com.niit.ComputerHardware.Dao.productDao;
import com.niit.ComputerHardware.Dao.supplierDao;
import com.niit.ComputerHardware.model.category;
import com.niit.ComputerHardware.model.product;
import com.niit.ComputerHardware.model.supplier;

public class producttest 
{
public static void main(String a[])
{
	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
	ctx.scan("com.niit.*");
	ctx.refresh();
	
	product pro=(product)ctx.getBean("product");
	productDao proDao=(productDao)ctx.getBean("productDao");
	
	
	category cat=(category)ctx.getBean("category");
	categoryDao catDao=(categoryDao)ctx.getBean("categoryDao");
	
	
	supplier sup=(supplier)ctx.getBean("supplier");
	supplierDao supDao=(supplierDao)ctx.getBean("supplierDao");
	
	
	pro.setProdId("123");
	pro.setProdName("abcd");
	pro.setProdPrice("100");
	pro.setProdQty("10");
	pro.setProdDiscription("abcdef");
	
	cat=catDao.getcategory("123");
	pro.setCategory(cat);
	
	sup=supDao.getsupplier("123");
	pro.setSupplier(sup);
	
	
	if(proDao.saveorupdate(pro)==true)
	{
		System.out.println("product save");
	}
	else
	{
		System.out.println("product not saved");
	}
	
	pro.setProdId("124");
	pro.setProdName("abcde");
	pro.setProdPrice("120");
	pro.setProdQty("10");
	pro.setProdDiscription("abcdef");
	cat=catDao.getcategory("123");
	pro.setCategory(cat);
	sup=supDao.getsupplier("123");
	pro.setSupplier(sup);
	
	if(proDao.saveorupdate(pro)==true)
	{
		System.out.println("product save");
	}
	else
	{
		System.out.println("product not saved");
	}
	
	pro.setProdId("125");
	pro.setProdName("abcdef");
	pro.setProdPrice("100");
	pro.setProdQty("10");
	pro.setProdDiscription("abcdef");
	cat=catDao.getcategory("123");
	pro.setCategory(cat);
	sup=supDao.getsupplier("123");
	pro.setSupplier(sup);
	
	if(proDao.saveorupdate(pro)==true)
	{
		System.out.println("product save");
	}
	else
	{
		System.out.println("product not saved");
	}
	
    pro=proDao.getproduct("123");
	if(pro!=null)
	{
		System.out.println(pro.getProdId());
		System.out.println(pro.getProdName());
		System.out.println(pro.getProdPrice());
		System.out.println(pro.getProdQty());
		System.out.println(pro.getProdDiscription());
	}
	else
	{
		System.out.println("product details not found");
	}
	
	
	
	pro=proDao.getproduct("124");
	if(pro!=null)
	{
		System.out.println("product being deleated");
		if(proDao.delete(pro)==true)
		{
			System.out.println("product deleated");
		}
		else
		{
			System.out.println("product not deleated");
		}
	}
	else
	{
		System.out.println("product details not found");
		
	}
	
	List<product> productlist=proDao.productlist();
	for(product p:productlist)
	{
		System.out.println(p.getProdId());
		System.out.println(p.getProdName());
		System.out.println(p.getProdPrice());
		System.out.println(p.getProdQty());
		System.out.println(p.getProdDiscription());
	}
	
	
	/*product obj_product= new product();
	obj_product.setProdId("321");
	obj_product.setProdName("abc");
	obj_product.setProdPrice("100");
	obj_product.setProdQty("2");
	obj_product.setProdDiscription("hello");
	System.out.println(obj_product.getProdId());
	System.out.println(obj_product.getProdName());
	System.out.println(obj_product.getProdPrice());
	System.out.println(obj_product.getProdQty());
	System.out.println(obj_product.getProdDiscription());*/
}
}
