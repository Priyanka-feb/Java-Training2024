package com.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller 
public class LogController {
 @RequestMapping("/login")
 
   public ModelAndView Login(HttpServletRequest req, HttpServletResponse res)
   {   
   ModelAndView mv=new ModelAndView();
   
     String uname = req.getParameter("Username");
     String pass = req.getParameter("Password");
     
    	 if (new LogService().check(uname, pass))
    	 {
    		 mv.setViewName("success.jsp");
    	 }
    	else
    	{
    			mv.setViewName("index.jsp"); 
    		 
    	 }
    	 return mv;
     
}
}

