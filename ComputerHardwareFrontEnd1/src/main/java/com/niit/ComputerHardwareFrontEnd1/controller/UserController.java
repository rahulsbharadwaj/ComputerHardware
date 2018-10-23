package com.niit.ComputerHardwareFrontEnd1.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.ComputerHardware.model.Cart;
import com.niit.ComputerHardware.model.user;
import com.niit.ComputerHardware.Dao.userDao;
@Controller
public class UserController 
{
	@Autowired
	user user;
	@Autowired
	userDao userDao;
	
	@RequestMapping("/user")
	public ModelAndView userform()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("user",new user());
		List<user>userlist=userDao.userlist();
		mv.addObject("users",userlist);
		mv.setViewName("Registration");
		return mv;
	}

	
	@RequestMapping("/adduser")
	public ModelAndView adduser(@ModelAttribute("user")user user)
	{
		ModelAndView mv=new ModelAndView();
		Cart cart= new Cart();
		user.setCart(cart);
		if(userDao.saveorupdate(user)==true)
		{
			
			mv.addObject("Msg","user saved");
		}
		else
		{
			mv.addObject("Msg","user Not saved");
		}
		mv.setViewName("redirect:/user");
		return mv;
		
				
	}
	
}
