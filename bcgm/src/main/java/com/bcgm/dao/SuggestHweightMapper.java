package com.bcgm.dao;

import com.bcgm.bean.SuggestHweight;
import com.bcgm.bean.SuggestHweightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuggestHweightMapper {
    long countByExample(SuggestHweightExample example);

    int deleteByExample(SuggestHweightExample example);

    int deleteByPrimaryKey(String hwresult);

    int insert(SuggestHweight record);

    int insertSelective(SuggestHweight record);

    List<SuggestHweight> selectByExample(SuggestHweightExample example);

    SuggestHweight selectByPrimaryKey(String hwresult);

    int updateByExampleSelective(@Param("record") SuggestHweight record, @Param("example") SuggestHweightExample example);

    int updateByExample(@Param("record") SuggestHweight record, @Param("example") SuggestHweightExample example);

    int updateByPrimaryKeySelective(SuggestHweight record);

    int updateByPrimaryKey(SuggestHweight record);
}