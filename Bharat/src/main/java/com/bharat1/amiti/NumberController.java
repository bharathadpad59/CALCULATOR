package com.bharat1.amiti;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NumberController 
	{
		String num1="";
		String display,opt;
		int num2=0;
		
		ModelAndView m1=new ModelAndView();
		
		@RequestMapping("/numbercontroller")
		public ModelAndView NumberController(HttpServletRequest request,HttpServletResponse response) 
		{
		num1+= request.getParameter("submit");
		m1.addObject("Result",num1);
		m1.setViewName("index.jsp");
		
		return m1;
		
		}
		
		@RequestMapping("/operatorcontroller")
		public ModelAndView OperatorController(HttpServletRequest request,HttpServletResponse response) 
		{
			num2+=(Integer.parseInt(num1));
			num1="";
			opt=request.getParameter("submit");
			m1.addObject("Result",opt);
			m1.setViewName("index.jsp");
			return m1;
		}
				Calculations c1=new Calculations();
		@RequestMapping("/equalcontroller")
		public ModelAndView EqualController(HttpServletRequest request,HttpServletResponse response) 
		{
			
			switch (opt) {
			case "+":
		
				display=""+c1.add(num2,Integer.parseInt(num1));
				break;
				
			case "-":
				
				display=""+c1.sub(num2,Integer.parseInt(num1));
				break;
				
			case "*":
				
				display=""+c1.mul(num2,Integer.parseInt(num1));
				break;
				
			case "/":
				
				display=""+c1.div(num2,Integer.parseInt(num1));
				break;
				
			case "%":
				
				display=""+c1.per(num2,Integer.parseInt(num1));
				break;

			default:
				break;
			}
			
			m1.addObject("Result",display);
			m1.setViewName("index.jsp");
			return m1;
		}
		
		
		
		
	}
	

