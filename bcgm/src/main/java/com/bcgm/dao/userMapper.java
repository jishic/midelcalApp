package com.bcgm.dao;

import java.util.List;

import com.bcgm.bean.User;

public interface userMapper {
	List<User> selectByname(String username);
	

}
