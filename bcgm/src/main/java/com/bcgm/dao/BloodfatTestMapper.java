package com.bcgm.dao;

import com.bcgm.bean.BloodfatTest;
import com.bcgm.bean.BloodfatTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BloodfatTestMapper {
    long countByExample(BloodfatTestExample example);

    int deleteByExample(BloodfatTestExample example);

    int insert(BloodfatTest record);

    int insertSelective(BloodfatTest record);

    List<BloodfatTest> selectByExample(BloodfatTestExample example);

    int updateByExampleSelective(@Param("record") BloodfatTest record, @Param("example") BloodfatTestExample example);

    int updateByExample(@Param("record") BloodfatTest record, @Param("example") BloodfatTestExample example);
}