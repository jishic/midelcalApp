package com.bcgm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.bcgm.bean.Disease;
import com.bcgm.dao.DiseaseMapper;

@Service
@Scope
public class DiseaseService {
	@Autowired
	private DiseaseMapper diseaseMapper;
	//通过疾病部位和性别查询到该部位所有的疾病
	public List<Disease> selectBy(String diseasePosition) {
		return diseaseMapper.selectBy(diseasePosition);
	}

	//通过疾病名称查找疾病
	public Disease selectByDseaseName(String diseaseName) {
		return diseaseMapper.selectByDseaseName(diseaseName);
	}

	//通过疾病名称查找疾病
	public List<Disease> blurSelectByDseaseName(String blurName) {
		return diseaseMapper.blurSelectByDseaseName(blurName);
	}
}
