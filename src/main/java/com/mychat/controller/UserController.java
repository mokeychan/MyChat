/**
 * 
 */
package com.mychat.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mychat.domain.User;
import com.mychat.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	@RequestMapping("/login")
	public String login(String userPhone,String userPassword,HttpSession session) throws Exception{
		User user=userService.login(userPhone,userPassword);
		if(user!=null){
			return "redirect:list.action?userId="+user.getUserId();
		}else{
			return "redirect:index.jsp";
		}
		
	}
}
