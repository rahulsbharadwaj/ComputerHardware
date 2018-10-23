package com.niit.ComputerHardwareFrontEnd1.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.ComputerHardware.Dao.categoryDao;
import com.niit.ComputerHardware.model.category;
@Controller
public class CategoryController
{
	@Autowired
	category category;
	@Autowired
	categoryDao categoryDao;
	
	@RequestMapping("/category")
	public ModelAndView categoryform()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("category",new category());
		List<category> catlist=categoryDao.catlist();
		mv.addObject("categories",catlist);
		mv.setViewName("category");
		return mv;
	}

	
	@RequestMapping("/addcategory")
	public ModelAndView addcategory(@ModelAttribute("category")category category)
	{
		ModelAndView mv=new ModelAndView();
		if(categoryDao.saveorupdate(category)==true)
		{
			mv.addObject("Msg","Category saved");
		}
		else
		{
			mv.addObject("Msg","Category Not saved");
		}
		mv.setViewName("redirect:/category");
		return mv;
		
				
	}
	
	@RequestMapping("/editcategory/{categoryid}")
	public ModelAndView editcategory(@PathVariable("categoryid")String categoryid)
	{
		ModelAndView mv=new ModelAndView("category");
		category=categoryDao.getcategory(categoryid);
		mv.addObject("category",category);
		List<category>catlist=categoryDao.catlist();
		mv.addObject("categories",catlist);
        return mv;

	}  
	
	@RequestMapping("/deletecategory/{categoryid}")
	public ModelAndView deletecategory(@PathVariable("categoryid")String categoryid)
	{
		ModelAndView mv=new ModelAndView("redirect:/category");
		category=categoryDao.getcategory(categoryid);
       if(categoryDao.delete(category)==true)
       {
    	   mv.addObject("Msg1","category deleted");
       }
       else
       {
    	   mv.addObject("Msg1","category not deleted");
       }
       return mv;
	}
	
	
	
	  
}
