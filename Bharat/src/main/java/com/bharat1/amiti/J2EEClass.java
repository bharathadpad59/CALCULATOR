package com.bharat1.amiti;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class J2EEClass {
	
	JdbcTemplate jdbcTemplate;
	@RequestMapping("/authentication")
	public ModelAndView getDataSource(HttpServletRequest request, HttpServletResponse response) {
		
		ModelAndView m1=new ModelAndView();
		String userName = request.getParameter("login");

		String password = request.getParameter("passwordd");
		
		System.out.println(userName + ", " + password);

		BasicDataSource d1 = new BasicDataSource();
		d1.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		d1.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		d1.setUsername(userName);
		d1.setPassword(password);
		
		jdbcTemplate = new JdbcTemplate(d1);
		
		m1.setViewName("output2.jsp");
		
		return m1;
		
	}
	
	@RequestMapping("authenticationnew")
	public ModelAndView OutputMethod(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView m2 = new ModelAndView();
		String s1=request.getParameter("output");
		String s2="";
		try {
			List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from studds where name='"+s1+"'");
			for(int i=0;i<list.size();i++) {
				String a[]=(""+list.get(i)).split(",");
				s2+="\n"+a[0].substring(a[0].indexOf("=")+1)+"   "+"   "+a[1].substring(a[1].indexOf("=")+1)+"   "+"        "+a[2].substring(a[2].indexOf("=")+1);
			}
		}catch(Exception e) {
			System.out.println("Exception ");
			e.printStackTrace();
		}
		
			m2.addObject("s2",s2);
			m2.setViewName("output3.jsp");
		return m2;
	}

}
