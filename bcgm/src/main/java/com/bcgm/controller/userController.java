package com.bcgm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bcgm.bean.User;
import com.bcgm.service.userService;
import com.mysql.fabric.xmlrpc.base.Value;

@Controller
@RequestMapping(value = "/user")
public class userController {
	@Autowired
	private userService userService;
	
	@RequestMapping(value = "/login")
	public String selectByname(Model model,HttpServletRequest a){
		String username = a.getParameter("username");
		List <User> list = userService.select(username);
		model.addAttribute("list", list);
		for(int  i = 0; i < list.size(); i++){
			System.out.println(list.get(i).getUsername());
		}
		return "Login";
	}
//	@RequestMapping(value = "/register")
//	public String insert(HttpServletRequest b){
//		String username = b.getParameter("username");
//		String password = b.getParameter("password");
//		
//		
//	}
}
