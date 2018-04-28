package com.bcgm.dao;

import com.bcgm.bean.StepCount;
import com.bcgm.bean.StepCountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StepCountMapper {
    long countByExample(StepCountExample example);

    int deleteByExample(StepCountExample example);

    int insert(StepCount record);

    int insertSelective(StepCount record);

    List<StepCount> selectByExample(StepCountExample example);

    int updateByExampleSelective(@Param("record") StepCount record, @Param("example") StepCountExample example);

    int updateByExample(@Param("record") StepCount record, @Param("example") StepCountExample example);
}