package com.bbs.dao;

import com.bbs.entity.Users;

public interface UserDao {
	
	int insert(Users user);
	
	Users findByName(String uname);
	/**
	 * 修改用户积分
	 */
	int updatePoint(int uid,int increment);
	
	
}
