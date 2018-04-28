package com.bcgm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcgm.bean.Meditable;
import com.bcgm.dao.MeditableMapper;

@Service
public class MedicleService {
	@Autowired
	MeditableMapper meMapper;
	
	public Meditable getMedicle(String medicine){
		System.out.println("qweeqw");
		Meditable me = meMapper.selectByPrimaryKey(medicine);
		return me;
	}

	public List<Meditable> getByExample(String category) {
		// TODO Auto-generated method stub
		return meMapper.selectByExample(category);
	}

	public List<String> selectBycategory() {
		// TODO Auto-generated method stub
		return meMapper.selectBycategory();
	}
}
