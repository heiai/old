package com.slider.wust.service;

import com.slider.wust.common.Message;
import com.slider.wust.model.User;

public interface LoginService {
	public Message login(String name,String password);
	
	public Message register(User user);
}
