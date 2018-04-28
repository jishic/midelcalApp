package com.bcgm.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bcgm.bean.Disease;
import com.bcgm.service.DiseaseService;

@Controller
@RequestMapping(value = "/Disease")
public class DiseaseController {
	@Autowired
	private DiseaseService diseaseService;

	//按疾病名称查找疾病
	@RequestMapping(value="/selectName",method = RequestMethod.POST)
	public String selectByDseaseName(String DiseaseName,Model model) {

		System.out.println(DiseaseName);
		System.out.println(diseaseService.selectByDseaseName(DiseaseName).toString());
		model.addAttribute("disease",diseaseService.selectByDseaseName(DiseaseName));
		return "/Disease/DetailsOfTheDisease";
	}

	//搜索框模糊查找
	@RequestMapping(value="/blurSelect",method = RequestMethod.POST)
	public String blurSelectByName(String blurName,Model model){

		System.out.println(blurName);
		if(blurName == ""){
			//当输入为空的时候
			return "/Disease/DiseaseDiagnosisIndex";
		}

		List<Disease> ar = new ArrayList<Disease>();
		ar = diseaseService.blurSelectByDseaseName(blurName);
		if(ar.size() == 0){
			//当没有查找到结果时
			return "/Disease/DiseaseDiagnosisIndex";
		}
		
		String []blurDisease = new String[ar.size()];
		for(int i = 0;i<ar.size();i++){
			blurDisease[i] = ar.get(i).getDdq_name();
			System.out.println( ar.get(i).getDdq_name());
		}

		model.addAttribute("blurDisease",blurDisease);

		return "/Disease/ListIOfDiseases";
	}


	//按照疾病部位查找疾病
	@RequestMapping(value="/SymptomSelection",method = RequestMethod.POST	)
	public String selectBy( String diseasePosition  ,HttpSession session,Model model) {


		List<Disease> ar = new ArrayList<Disease>();
		List<String[]> nameAndSymptom = new ArrayList<String[]>();
		List<String> symptom = new ArrayList<String>();
		List<String> name = new ArrayList<String>();
		ar = diseaseService.selectBy(diseasePosition);

		for(int i=0;i<ar.size();i++){
			name.add(ar.get(i).getDdq_name());
			String symptoms = ar.get(i).getDdq_symptom_index();
			String[] symptomArray = symptoms.split(",");
			for(int m = 0;m<symptomArray.length;m++){
				String []newstr = new String[2];
				newstr[0] = ar.get(i).getDdq_name();
				newstr[1] = symptomArray[m];
				nameAndSymptom.add(newstr);
				if(!symptom.contains(symptomArray[m])){
					symptom.add(symptomArray[m]);
				}
			}

		}
		session.setAttribute("nameAndSymptom", nameAndSymptom);
		session.setAttribute("name", name);
		model.addAttribute("symptom",symptom);
		
		return "/Disease/SymptomSelection";
	}

	//按症状的选择确定疑似疾病
	@RequestMapping(value ="/b",method = RequestMethod.POST)
	public  String classifyBysymptom(String needSymptom[],HttpSession session,Model model) {
		@SuppressWarnings("unchecked")
		List<String[]> nameAndSymptom = (ArrayList<String[]>) session.getAttribute("nameAndSymptom");
		@SuppressWarnings("unchecked")
		List<String> name = (ArrayList<String>) session.getAttribute("name");
		List<String> names = new ArrayList<String>();
		String jilu = "";
		int count = 0;
		System.out.println(nameAndSymptom.size());
		for(int i = 0;i<nameAndSymptom.size();i++){
			if(jilu == ""){
				jilu = nameAndSymptom.get(i)[0];
			}else if(jilu != nameAndSymptom.get(i)[0]){
				jilu = nameAndSymptom.get(i)[0];
				count = 0;
			}
			for(int j = 0;j<needSymptom.length;j++){
				String str1 = nameAndSymptom.get(i)[1].trim();
				String str2 = needSymptom[j].trim();
				if(str1.equals(str2)){
					count ++;
					System.out.println("ssdsdsdsdsdsdsds");
				}
			}
			
			if(count == needSymptom.length){
				names.add(nameAndSymptom.get(i)[0]);
			}	
		}	
		
		model.addAttribute("names",names);

		return "/Disease/SuspectedDisease";
	}
}
