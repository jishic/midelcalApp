package com.bcgm.dao;

import com.bcgm.bean.SuggestBloodsuger;
import com.bcgm.bean.SuggestBloodsugerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuggestBloodsugerMapper {
    long countByExample(SuggestBloodsugerExample example);

    int deleteByExample(SuggestBloodsugerExample example);

    int deleteByPrimaryKey(String bsresult);

    int insert(SuggestBloodsuger record);

    int insertSelective(SuggestBloodsuger record);

    List<SuggestBloodsuger> selectByExample(SuggestBloodsugerExample example);

    SuggestBloodsuger selectByPrimaryKey(String bsresult);

    int updateByExampleSelective(@Param("record") SuggestBloodsuger record, @Param("example") SuggestBloodsugerExample example);

    int updateByExample(@Param("record") SuggestBloodsuger record, @Param("example") SuggestBloodsugerExample example);

    int updateByPrimaryKeySelective(SuggestBloodsuger record);

    int updateByPrimaryKey(SuggestBloodsuger record);
}