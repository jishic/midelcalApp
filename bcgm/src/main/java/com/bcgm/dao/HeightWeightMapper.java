package com.bcgm.dao;

import com.bcgm.bean.HeightWeight;
import com.bcgm.bean.HeightWeightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HeightWeightMapper {
    long countByExample(HeightWeightExample example);

    int deleteByExample(HeightWeightExample example);

    int insert(HeightWeight record);

    int insertSelective(HeightWeight record);

    List<HeightWeight> selectByExample(HeightWeightExample example);

    int updateByExampleSelective(@Param("record") HeightWeight record, @Param("example") HeightWeightExample example);

    int updateByExample(@Param("record") HeightWeight record, @Param("example") HeightWeightExample example);
}