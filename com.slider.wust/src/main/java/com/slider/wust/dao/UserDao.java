package com.slider.wust.dao;

import java.util.List;

import com.slider.wust.model.User;

public interface UserDao {
	
	/**
	 *查询符合条件的用户 
	 * @param user 查询条件
	 * @return
	 */
	public List<User> select(User user);
	
	/**
	 * 更新用户信息 
	 * @param user
	 * @return
	 */
	public int update(User user);

}
