package com.bbs.service.impl;

import com.bbs.dao.UserDao;
import com.bbs.entity.Users;
import com.bbs.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	@Override
	public Users login(String uname, String upass) {
		// TODO Auto-generated method stub
		Users findUser=userDao.findByName(uname);
		if(findUser!=null&&findUser.getPwd().equals(upass)){
			return findUser;
		}
		//jdbc´úÂë
		return null;
	}

}
