package com.niit.ComputerHardwareFrontEnd1.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.ComputerHardware.model.supplier;
import com.niit.ComputerHardware.Dao.supplierDao;

@Controller
public class SupplierController 
{
	@Autowired
	supplier supplier;
	@Autowired
	supplierDao supplierDao;
	
	@RequestMapping("/supplier")
	public ModelAndView supplierform()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("supplier",new supplier());
		List<supplier>supplierlist=supplierDao.supplierlist();
		mv.addObject("suppliers",supplierlist);
		mv.setViewName("supplier");
		return mv;
	}
	
	
	
	
	@RequestMapping("/addsupplier")
	public ModelAndView addsupplier(@ModelAttribute("supplier")supplier supplier)
	{
		ModelAndView mv=new ModelAndView();
		if(supplierDao.saveorupdate(supplier)==true)
		{
			mv.addObject("Msg","supplier saved");
		}
		else
		{
			mv.addObject("Msg","supplier Not saved");
		}
		mv.setViewName("redirect:/supplier");
		return mv;
		
				
	}
	
	
	
	@RequestMapping("/editsupplier/{supId}")
	public ModelAndView editsupplier(@PathVariable("supId")String supId)
	{
		ModelAndView mv=new ModelAndView("supplier");
		supplier=supplierDao.getsupplier(supId);
		mv.addObject("supplier",supplier);
		List<supplier>supplierlist=supplierDao.supplierlist();
		mv.addObject("suppliers",supplierlist);
        return mv;

	}
	
	
	@RequestMapping("/deletesupplier/{supId}")
	public ModelAndView deletesupplier(@PathVariable("supId")String supId)
	{
		ModelAndView mv=new ModelAndView("redirect:/supplier");
		supplier=supplierDao.getsupplier(supId);
       if(supplierDao.delete(supplier)==true)
       {
    	   mv.addObject("Msg1","supplier deleted");
       }
       else
       {
    	   mv.addObject("Msg1","supplier not deleted");
       }
       return mv;
	}
	
	
	
	
}
