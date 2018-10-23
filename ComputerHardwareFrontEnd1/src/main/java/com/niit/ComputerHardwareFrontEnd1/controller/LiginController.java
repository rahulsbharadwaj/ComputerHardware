package com.niit.ComputerHardwareFrontEnd1.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.niit.ComputerHardware.model.user;
import com.niit.ComputerHardware.Dao.userDao;

import com.niit.ComputerHardware.Dao.categoryDao;
import com.niit.ComputerHardware.model.category;
@Controller
public class LiginController 
{
	
	@Autowired
	user user;
	@Autowired
	userDao userDao;
	
	@Autowired
	category category;
	@Autowired
	categoryDao categoryDao;
	@RequestMapping("/login")
	public String login(@RequestParam(value="error",required=false)String error,
			@RequestParam(value="logout",required=false)String logout,Model model)
	{
		if(error!=null)
			model.addAttribute("error","invalid username or password");
		if(logout!=null)
			model.addAttribute("logout","logout successfully");
		List<category> categories= categoryDao.catlist();
		model.addAttribute("lcat", categories);
		return "login";
	}
	@RequestMapping(value="/j_spring_security_check")
	public String Login(@RequestParam("j_username")String umail,@RequestParam("j_password")String pwd,Model model,HttpSession session)
{
	user u=userDao.isValid(umail,pwd);
	if(u==null)
	{
		model.addAttribute("msg","Invalid username pwd");
		return "redirect:/";
	}
	else
	{
		session.setAttribute("user",u);
		session.setAttribute("name",u.getUserName());
//	session.setAttribute("items",u.getTotal_items());
	return "redirect:/";
}
}
@RequestMapping(value="/j_spring_security_logout")
public String logout(HttpServletRequest request,HttpSession session,Model model)
{
	session.invalidate();
	session=request.getSession(true);
	model.addAttribute("logout","logout Successfully");
	return "redirect:/";
}

	   
}
