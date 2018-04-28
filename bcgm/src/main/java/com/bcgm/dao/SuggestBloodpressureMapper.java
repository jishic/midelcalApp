package com.bcgm.dao;

import com.bcgm.bean.SuggestBloodpressure;
import com.bcgm.bean.SuggestBloodpressureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuggestBloodpressureMapper {
    long countByExample(SuggestBloodpressureExample example);

    int deleteByExample(SuggestBloodpressureExample example);

    int deleteByPrimaryKey(String bpresult);

    int insert(SuggestBloodpressure record);

    int insertSelective(SuggestBloodpressure record);

    List<SuggestBloodpressure> selectByExample(SuggestBloodpressureExample example);

    SuggestBloodpressure selectByPrimaryKey(String bpresult);

    int updateByExampleSelective(@Param("record") SuggestBloodpressure record, @Param("example") SuggestBloodpressureExample example);

    int updateByExample(@Param("record") SuggestBloodpressure record, @Param("example") SuggestBloodpressureExample example);

    int updateByPrimaryKeySelective(SuggestBloodpressure record);

    int updateByPrimaryKey(SuggestBloodpressure record);
}