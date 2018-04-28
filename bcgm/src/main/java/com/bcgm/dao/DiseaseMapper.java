package com.bcgm.dao;

import com.bcgm.bean.Disease;
import java.util.List;

public interface DiseaseMapper {

    public List<Disease> selectBy(String diseasePosition); //获取一个部位的所有疾病

    public Disease selectByDseaseName(String diseaseName); //按疾病名搜索

    public List<Disease> blurSelectByDseaseName(String blurName); //按疾病名模糊搜索
}