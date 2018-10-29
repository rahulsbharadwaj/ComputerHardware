package com.niit.ComputerHardwareFrontEnd1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController 
{
   @RequestMapping("/")
   public String home()  
   {
	return "index";
   } 
 

   @RequestMapping("/product1")
   public String product1()  
   {
	return "product 1";
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
   
   
}
