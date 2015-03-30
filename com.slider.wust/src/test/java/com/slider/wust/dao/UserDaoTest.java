package com.slider.wust.dao;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:META-INF/applicationContext.xml"})
public class UserDaoTest {
	
	@Resource
	private UserDao userDao;
	
	@Test
	public void selectTest(){
		assertEquals(1, userDao.select(null).size());
	}
}
