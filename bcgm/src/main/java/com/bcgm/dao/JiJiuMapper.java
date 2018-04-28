package com.bcgm.dao;

import com.bcgm.bean.Meditable;
import com.bcgm.bean.MeditableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;


import com.bcgm.bean.JiJiu;

public interface JiJiuMapper {
       public List<JiJiu>  getAllill();
       public List<JiJiu>  getTitleill(@Param(value="title") String title);
       public List<JiJiu>  getAllskill();
       public List<JiJiu>  getTitleskill(@Param(value="title") String title);
}
