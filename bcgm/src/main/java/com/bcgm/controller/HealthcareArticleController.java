package com.bcgm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bcgm.bean.HealthcareArticle;
import com.bcgm.service.HealthcareService;

@Controller
@RequestMapping(value = "/healthcare")
public class HealthcareArticleController {
	@Autowired
	HealthcareService healthcareSvc;

	HealthcareArticle articlesql;

	@RequestMapping(value = "/moduleArticle")
	public String getModuleArticle(Model model, HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		List<HealthcareArticle> articleList = healthcareSvc.getModuleArticle(id);
		model.addAttribute("article", articleList);
		model.addAttribute("module", id);
		String s = null;

		return "Healthcare/showContent";
		//return "healthcareArticle";
	}

	@RequestMapping(value = "/searchArticle")
	public String searchArticle(Model model, HttpServletRequest request){
		String word = request.getParameter("word");
		word = "%" + word + "%";
		List<HealthcareArticle> articleList = healthcareSvc.searchArticle(word);
		model.addAttribute("article", articleList);
		model.addAttribute("module", 10);
		return "Healthcare/showContent";
	}

	@ResponseBody
	@RequestMapping(value = "/getArticleByAid", produces = " text/plain; charset=utf-8")
	public String getArticleById(HttpServletRequest request, String aid){

		HealthcareArticle article = healthcareSvc.getArticleById(Integer.parseInt(request.getParameter("aid")));
		return article.gethContent();
	}

}
