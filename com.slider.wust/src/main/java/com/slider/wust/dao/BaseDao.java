package com.slider.wust.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;


public abstract class BaseDao {
	
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	} 
	
	
}
