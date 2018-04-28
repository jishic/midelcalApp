package com.bcgm.controller;


import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bcgm.bean.JiJiu;
import com.bcgm.service.JiJiuService;

@Controller
@RequestMapping(value="/JiJiu")
public class JiJiuController {
	@Resource
	private JiJiuService jiJiuService;
	List<JiJiu>list=null;
	@RequestMapping(value="/all_ill.action")
	public String getAllill(Model model,HttpServletRequest r) throws UnsupportedEncodingException{//Model model
		r.setCharacterEncoding("UTF-8");
		list=jiJiuService.getAll_ill();
		model.addAttribute("list", list);
		return "helpleft";
	}

	@RequestMapping(value="/title_ill.action")
	public String getTitleill(Model model,HttpServletRequest r){
		String title=r.getParameter("search");
		List<JiJiu>list1 = new ArrayList();
	    for(int i=0;i<list.size();i++){
	    	if(list.get(i).getTitle().indexOf(title)>-1){
	    		System.out.println(list.get(i).getTitle()+"111");
	    		list1.add(list.get(i));
	    	}
	    }
		list=list1;
		model.addAttribute("list", list);
		return "helpleft";
	}
	@RequestMapping(value="/all_skill.action")
	public String getAllskill(Model model){
		list=jiJiuService.getAll_skill();
		model.addAttribute("list", list);
		return "helpleft1";
	}
	@RequestMapping(value="/title_skill.action")
	public String getTitleskill(Model model,HttpServletRequest r){
		String title=r.getParameter("search");
		List<JiJiu>list1 = new ArrayList();
	    for(int i=0;i<list.size();i++){
	    	if(list.get(i).getTitle().indexOf(title)>-1){
	    		System.out.println(list.get(i).getTitle()+"111");
	    		list1.add(list.get(i));
	    	}
	    }
		list=list1;
		model.addAttribute("list", list);
		return "helpleft1";
	}
	
}
