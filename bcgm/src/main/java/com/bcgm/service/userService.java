package com.bcgm.service;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.bcgm.bean.User;
import com.bcgm.dao.userMapper;

@Service
@Scope
public class userService {
	private userMapper userMapper;

	public List<User> select(String username){
		return userMapper.selectByname(username);
	}
}
