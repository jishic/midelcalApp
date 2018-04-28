package com.bcgm.dao;

import com.bcgm.bean.Meditable;
import com.bcgm.bean.MeditableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeditableMapper {


    List<Meditable> selectByExample(String category);

    Meditable selectByPrimaryKey(String medicine);
    
    List<String> selectBycategory();

}