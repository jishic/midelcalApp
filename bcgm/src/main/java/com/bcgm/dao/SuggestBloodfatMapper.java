package com.bcgm.dao;

import com.bcgm.bean.SuggestBloodfat;
import com.bcgm.bean.SuggestBloodfatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuggestBloodfatMapper {
    long countByExample(SuggestBloodfatExample example);

    int deleteByExample(SuggestBloodfatExample example);

    int deleteByPrimaryKey(String bfresult);

    int insert(SuggestBloodfat record);

    int insertSelective(SuggestBloodfat record);

    List<SuggestBloodfat> selectByExample(SuggestBloodfatExample example);

    SuggestBloodfat selectByPrimaryKey(String bfresult);

    int updateByExampleSelective(@Param("record") SuggestBloodfat record, @Param("example") SuggestBloodfatExample example);

    int updateByExample(@Param("record") SuggestBloodfat record, @Param("example") SuggestBloodfatExample example);

    int updateByPrimaryKeySelective(SuggestBloodfat record);

    int updateByPrimaryKey(SuggestBloodfat record);
}