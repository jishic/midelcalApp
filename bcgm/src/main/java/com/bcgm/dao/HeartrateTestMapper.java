package com.bcgm.dao;

import com.bcgm.bean.HeartrateTest;
import com.bcgm.bean.HeartrateTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HeartrateTestMapper {
    long countByExample(HeartrateTestExample example);

    int deleteByExample(HeartrateTestExample example);

    int insert(HeartrateTest record);

    int insertSelective(HeartrateTest record);

    List<HeartrateTest> selectByExample(HeartrateTestExample example);

    int updateByExampleSelective(@Param("record") HeartrateTest record, @Param("example") HeartrateTestExample example);

    int updateByExample(@Param("record") HeartrateTest record, @Param("example") HeartrateTestExample example);
}