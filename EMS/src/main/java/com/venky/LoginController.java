package com.venky;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class LoginController {
LoginDAO dao= new LoginDAO();
	
	@RequestMapping("/login")
	public ModelAndView loginUser(HttpServletRequest req,HttpServletResponse res) {
		
		String uname= req.getParameter("u");
		String pass=req.getParameter("p");
		
		
		String result=null;
		 String ans = null;
		 ModelAndView mv= new ModelAndView();
		 String a ="(Wrong Password)";
		  String b = "(No Such User)";
		   ans = dao.UserValidate(uname);
		    if(ans.equals("Success")) {
		    	result=dao.Validate(uname,pass);
				
				
				
				if(result.equals("Success")) {
					mv.setViewName("Home.jsp");
					mv.addObject("name",uname);
				}else {
					mv.setViewName("index1.jsp");
					 mv.addObject("result1", a);
				}
		    	
		    }
		    else {
		    	mv.setViewName("index1.jsp");
				 mv.addObject("result1", b);
		    }
		  
		
		
		return mv;
		
	}

	
	@RequestMapping("/register")
	public ModelAndView UserRegistration(HttpServletRequest req,HttpServletResponse res) {
		
		String name=req.getParameter("name");
		String branch=req.getParameter("branch");
		String contact=req.getParameter("contact");
		String email=req.getParameter("email");
		String userName=req.getParameter("userName");
		String passWord=req.getParameter("passWord");
		
		String result=null;
		String ans = null;
		 String ans2 = null ;
		  ans = dao.UserValidate(userName);
		   ans2 = dao.emailvalidate(email);
		   ModelAndView mv= new ModelAndView();
		    if(ans.equals("Fail")&&ans2.equals("Fail")) {
				 
		result=dao.userRegistration(name,branch,contact,email,userName,passWord);
		
		
		if(result!=null) {
			mv.setViewName("Home.jsp");
			mv.addObject("name",userName);
		}else{
		    mv.setViewName("Registration1.jsp");
		    // mv.addObject("result1","Already User Exists");
		}
		}
		    else if(ans.equals("Success")&&ans2.equals("Success")) {
		    	 mv.setViewName("Registration1.jsp");
		    	 mv.addObject("result1","Already UserName and Mail Exists");
		    }
		    else if(ans.equals("Success")) {
		    	 mv.setViewName("Registration1.jsp");
		    	 mv.addObject("result1","Already UserName Exists");
		    }
		    
		    else {
		    	mv.setViewName("Registration1.jsp");
		    	 mv.addObject("result1","Already email Exists");
		    }
		
		
		return mv;
		
	}

}
