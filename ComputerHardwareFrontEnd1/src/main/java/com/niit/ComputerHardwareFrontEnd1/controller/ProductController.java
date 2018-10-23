package com.niit.ComputerHardwareFrontEnd1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.niit.ComputerHardware.model.product;
import com.niit.HardwareFrontend1.FileInput.FileInput;
import com.niit.ComputerHardware.Dao.productDao;
import com.niit.ComputerHardware.model.category;
import com.niit.ComputerHardware.Dao.categoryDao;
import com.niit.ComputerHardware.model.supplier;
import 	com.niit.ComputerHardware.Dao.supplierDao;

@Controller
public class ProductController 
{
	@Autowired
	product product;
	@Autowired
	productDao productDao;
	
	@Autowired
	category category;
	@Autowired
	categoryDao categoryDao;
	
	@Autowired
    supplier supplier;
	@Autowired
    supplierDao supplierDao;
	
	
	String path="C:\\Users\\bondi\\eclipse-workspace\\ComputerHardwareFrontEnd1\\src\\main\\webapp\\resources\\images\\";	
	@RequestMapping("/product")
	public ModelAndView productform()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("product",new product());
		List<product> productlist=productDao.productlist();
		mv.addObject("productes",productlist);
		List<category> catlist=categoryDao.catlist();
		List<supplier> supplierlist=supplierDao.supplierlist();
	    mv.addObject("categories",catlist);
	    mv.addObject("suppliers",supplierlist);		
		mv.setViewName("product");
		return mv;
	}
	
	@RequestMapping(value="/addproduct", method=RequestMethod.POST)
	public ModelAndView addproduct(@ModelAttribute("product")product product)
	{
		ModelAndView mv=new ModelAndView() ;
		
		List<category>catlist=categoryDao.catlist();
		List<supplier>supplierlist=supplierDao.supplierlist();
	    mv.addObject("categories",catlist);
	    mv.addObject("suppliers",supplierlist);
		
	    FileInput.upload(path, product.getPimg(), product.getProdId()+".jpg");
	    
		if(productDao.saveorupdate(product)==true)
		{
			mv.addObject("Msg","product saved");
		}
		else
		{
			mv.addObject("Msg","product Not saved");
		}
		mv.setViewName("redirect:/product");
		return mv;

	}
	
	@RequestMapping("/editproduct/{prodId}")
	public ModelAndView editproduct(@PathVariable("prodId")String prodId)
	{
		ModelAndView mv=new ModelAndView("product");
		product=productDao.getproduct(prodId);
		mv.addObject("product",product);
		List<product>  productlist=productDao.productlist();
		mv.addObject("productes",productlist);
		List<category>catlist=categoryDao.catlist();
		List<supplier>supplierlist=supplierDao.supplierlist();
	    mv.addObject("categories",catlist);
	    mv.addObject("suppliers",supplierlist);
		
		return mv;

	}

	@RequestMapping("/deleteproduct/{prodId}")
	public ModelAndView deleteproduct(@PathVariable("prodId")String prodId)
	{
		ModelAndView mv=new ModelAndView("redirect:/product");
		product=productDao.getproduct(prodId);
       if(productDao.delete(product)==true)
       {
    	   mv.addObject("Msg1","product deleted");
       }
       else
       {
    	   mv.addObject("Msg1","product not deleted");
       }
       return mv;
	}
	
	
	
}
