package com.bcgm.dao;

import com.bcgm.bean.HealthcareModule;
import com.bcgm.bean.HealthcareModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HealthcareModuleMapper {
    long countByExample(HealthcareModuleExample example);

    int deleteByExample(HealthcareModuleExample example);

    int deleteByPrimaryKey(Integer hModuleno);

    int insert(HealthcareModule record);

    int insertSelective(HealthcareModule record);

    List<HealthcareModule> selectByExample(HealthcareModuleExample example);

    HealthcareModule selectByPrimaryKey(Integer hModuleno);

    int updateByExampleSelective(@Param("record") HealthcareModule record, @Param("example") HealthcareModuleExample example);

    int updateByExample(@Param("record") HealthcareModule record, @Param("example") HealthcareModuleExample example);

    int updateByPrimaryKeySelective(HealthcareModule record);

    int updateByPrimaryKey(HealthcareModule record);
}