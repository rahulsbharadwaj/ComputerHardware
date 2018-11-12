package com.niit.ComputerHardwareFrontEnd1.controller;



import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.ComputerHardware.model.Cart;
import com.niit.ComputerHardware.model.category;
import com.niit.ComputerHardware.Dao.categoryDao;
import com.niit.ComputerHardware.model.product;
import com.niit.ComputerHardware.model.user;
import com.niit.ComputerHardware.Dao.productDao;
import com.niit.ComputerHardware.Dao.userDao;

@Controller
public class HomeController 
{
	@Autowired
	category category;
	@Autowired
	categoryDao categoryDao;
	@Autowired
	product product;
	@Autowired
	productDao productDao;
	@Autowired
	user user;
	@Autowired
	com.niit.ComputerHardware.Dao.userDao userDao;
	
   @RequestMapping("/")
   public String home(Model model, HttpSession session)  
   {
	   Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
       if(!(authentication instanceof AnonymousAuthenticationToken))
        {
              String currusername=authentication.getName();
              user user=userDao.getEmail(currusername);
              Cart cart=user.getCart();
			   List<product> products= productDao.productlist();
			   model.addAttribute("products", products);
			   List<category> categories= categoryDao.catlist();
			   model.addAttribute("categories", categories);
			   model.addAttribute("grandtotal", cart.getGrand_total());
	            session.setAttribute("items", cart.getTotal_items());
	            session.setAttribute("cartid", cart.getCart_Id());
        }
	   return "index";
   } 
 

   @RequestMapping("/product1/{prodId}")
   public String product1(@PathVariable("prodId")String prodId,Model model)  
   {
	   product=productDao.getproduct(prodId);
	   model.addAttribute("pro", product);
	   return "product1";
   } 
   
   @RequestMapping("/product2")
   public String product2()  
   {
	return "Product2";
   } 
   
   @RequestMapping("/product3")
   public String product3()  
   {
	return "product3";
   }
   
   @RequestMapping("/product4")
   public String product4()  
   {
	return "product4";
   }
   @RequestMapping("/product5")
   public String product5()  
   {
	return "product5";
   }
   @RequestMapping("/product6")
   public String product6()  
   {
	return "product6";
   }
   @RequestMapping("/header")
   public String header()  
   {
	return "header";
   }
   
   @RequestMapping("/footer")
   public String footer()  
   {
	return "footer";
   }
   @RequestMapping("/log-in")
   public String login()  
   {
	return "log-in";
   }
   
   @RequestMapping("/gallery")
   public String gallery()  
   {
	return "gallery";
   }
   
   
   
}
