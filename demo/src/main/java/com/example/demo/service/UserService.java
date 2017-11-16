package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.CiCustomer;
import com.example.demo.entity.User;

@Service

public class UserService {

	@Autowired
	private UserDao userDao;
	
	@Cacheable(value="getUser")
	public List<Map<String,Object>> getUser(User user){
		System.out.println("第二次不走");
		List<Map<String,Object>> list= userDao.selectUser(user);
		return list;
	}
}
