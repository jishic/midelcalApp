package com.bcgm.dao;

import com.bcgm.bean.JiJiu;
import com.bcgm.bean.SkillAid;
import com.bcgm.bean.SkillAidExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkillAidMapper {
    long countByExample(SkillAidExample example);

    int deleteByExample(SkillAidExample example);

    int deleteByPrimaryKey(Integer id);

    List<JiJiu> insert(SkillAid record);

    int insertSelective(SkillAid record);

    List<SkillAid> selectByExample(SkillAidExample example);

    SkillAid selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkillAid record, @Param("example") SkillAidExample example);

    int updateByExample(@Param("record") SkillAid record, @Param("example") SkillAidExample example);

    int updateByPrimaryKeySelective(SkillAid record);

    int updateByPrimaryKey(SkillAid record);
}