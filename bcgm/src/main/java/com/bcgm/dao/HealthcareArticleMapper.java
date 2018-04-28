package com.bcgm.dao;

import com.bcgm.bean.HealthcareArticle;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HealthcareArticleMapper {
/*
    int updateByExampleSelective(@Param("record") HealthcareArticle record, @Param("example") HealthcareArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") HealthcareArticle record, @Param("example") HealthcareArticleExample example);

    int updateByExample(@Param("record") HealthcareArticle record, @Param("example") HealthcareArticleExample example);*/

	public List<HealthcareArticle> getModuleArticle(int ModuleNo);

	public List<HealthcareArticle> searchArticle(String s);

	public HealthcareArticle getArticleById(int aid);

}