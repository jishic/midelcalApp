package com.bcgm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.bcgm.bean.JiJiu;
import com.bcgm.bean.SkillAid;
import com.bcgm.dao.JiJiuMapper;
import com.bcgm.dao.SkillAidMapper;

@Service("jiJiuService")
@Scope
public class JiJiuService {

	@Resource
	JiJiuMapper jijiuMapper;
	@Resource
	SkillAidMapper skillAidMapper;
	public List<JiJiu> getAll_ill() {
		// TODO Auto-generated method stub
		return jijiuMapper.getAllill();
		//return skillAidMapper.insert(skillAid);
	}

	public List<JiJiu> getTitle_ill(String title) {
		// TODO Auto-generated method stub
		return jijiuMapper.getTitleill(title);
	}

	public List<JiJiu> getAll_skill() {
		// TODO Auto-generated method stub
		return jijiuMapper.getAllskill();
	}

	public List<JiJiu> getTitle_skill(String title) {
		// TODO Auto-generated method stub
		return jijiuMapper.getTitleskill(title);
	}
	
}
