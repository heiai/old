package com.slider.wust.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.slider.wust.model.User;

@Repository
public class UserDaoImpl extends BaseDao implements UserDao{

	@Override
	public List<User> select(User parameter) {
		return this.getSqlSessionTemplate().selectList("UserMapper.select", parameter);
	}

	@Override
	public int update(User parameter) {
		return this.getSqlSessionTemplate().update("UserMapper.update", parameter);
	}



}
