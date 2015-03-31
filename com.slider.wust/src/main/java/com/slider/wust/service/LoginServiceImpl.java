package com.slider.wust.service;

import javax.annotation.Resource;

import com.slider.wust.common.Message;
import com.slider.wust.dao.UserDao;
import com.slider.wust.model.User;

public class LoginServiceImpl implements LoginService{
	
	@Resource
	private UserDao userDao;

	@Override
	public Message login(String name, String password) {
		return null;
	}

	@Override
	public Message register(User user) {
		return null;
	}
	

}
