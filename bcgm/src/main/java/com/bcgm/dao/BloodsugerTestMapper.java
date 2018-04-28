package com.bcgm.dao;

import com.bcgm.bean.BloodsugerTest;
import com.bcgm.bean.BloodsugerTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BloodsugerTestMapper {
    long countByExample(BloodsugerTestExample example);

    int deleteByExample(BloodsugerTestExample example);

    int insert(BloodsugerTest record);

    int insertSelective(BloodsugerTest record);

    List<BloodsugerTest> selectByExample(BloodsugerTestExample example);

    int updateByExampleSelective(@Param("record") BloodsugerTest record, @Param("example") BloodsugerTestExample example);

    int updateByExample(@Param("record") BloodsugerTest record, @Param("example") BloodsugerTestExample example);
}