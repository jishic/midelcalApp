package com.bcgm.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bcgm.bean.Meditable;
import com.bcgm.service.MedicleService;

@Controller
@RequestMapping(value="/medicine")
public class MedicleController {

	@Autowired
	MedicleService myMedicle;
	@RequestMapping(value="/search")
	public String getMedicle(@Param("medicine")String medicine, Model model){
		Meditable medi = null;
		if(medicine!=null && !medicine.equals("")){
			
			medi= myMedicle.getMedicle(medicine.trim());	
		}
		if(medi==null){
			return  "querymedicine";
		}
		model.addAttribute("meditable", medi);
		return "queryresult";
	}
	//搜索类型分类
	@RequestMapping(value="medicinesort")
	public String selectByExample(@Param("category")String category, Model model){
		System.out.println(category);
		List<Meditable> mList = myMedicle.getByExample(category);
		model.addAttribute("mlist", mList);
		return "medicinesort";
	}
	//搜索所有的药品种类
	@RequestMapping()
	public String selectBycategory(Model model){
		List<String> cateG = myMedicle.selectBycategory();
		model.addAttribute("cataList",cateG);
		return "search";
	}
}
