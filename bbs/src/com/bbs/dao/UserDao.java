package com.bbs.dao;

import com.bbs.entity.Users;

public interface UserDao {
	
	int insert(Users user);
	
	Users findByName(String uname);
	/**
	 * �޸��û�����
	 */
	int updatePoint(int uid,int increment);
	
	
}
