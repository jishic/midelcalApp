package com.bcgm.dao;

import com.bcgm.bean.SuggestHeartrate;
import com.bcgm.bean.SuggestHeartrateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuggestHeartrateMapper {
    long countByExample(SuggestHeartrateExample example);

    int deleteByExample(SuggestHeartrateExample example);

    int deleteByPrimaryKey(String hresult);

    int insert(SuggestHeartrate record);

    int insertSelective(SuggestHeartrate record);

    List<SuggestHeartrate> selectByExample(SuggestHeartrateExample example);

    SuggestHeartrate selectByPrimaryKey(String hresult);

    int updateByExampleSelective(@Param("record") SuggestHeartrate record, @Param("example") SuggestHeartrateExample example);

    int updateByExample(@Param("record") SuggestHeartrate record, @Param("example") SuggestHeartrateExample example);

    int updateByPrimaryKeySelective(SuggestHeartrate record);

    int updateByPrimaryKey(SuggestHeartrate record);
}