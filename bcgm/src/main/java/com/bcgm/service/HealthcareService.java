package com.bcgm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.bcgm.bean.HealthcareArticle;
import com.bcgm.dao.HealthcareArticleMapper;

@Service
@Scope
public class HealthcareService {
	@Resource
	private HealthcareArticleMapper healthcareArticleMapper;

	public List<HealthcareArticle> getModuleArticle(int ModuleNo){
		return healthcareArticleMapper.getModuleArticle(ModuleNo);
	}

	public List<HealthcareArticle> searchArticle(String s){
		return healthcareArticleMapper.searchArticle(s);
	}


	public HealthcareArticle getArticleById(int aid){
		return healthcareArticleMapper.getArticleById(aid);
	}
}
