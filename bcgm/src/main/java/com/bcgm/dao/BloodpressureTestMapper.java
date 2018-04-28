package com.bcgm.dao;

import com.bcgm.bean.BloodpressureTest;
import com.bcgm.bean.BloodpressureTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BloodpressureTestMapper {
    long countByExample(BloodpressureTestExample example);

    int deleteByExample(BloodpressureTestExample example);

    int insert(BloodpressureTest record);

    int insertSelective(BloodpressureTest record);

    List<BloodpressureTest> selectByExample(BloodpressureTestExample example);

    int updateByExampleSelective(@Param("record") BloodpressureTest record, @Param("example") BloodpressureTestExample example);

    int updateByExample(@Param("record") BloodpressureTest record, @Param("example") BloodpressureTestExample example);
}