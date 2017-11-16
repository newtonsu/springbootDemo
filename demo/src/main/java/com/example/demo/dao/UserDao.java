package com.example.demo.dao;

import java.util.List;
import java.util.Map;

import javax.persistence.Cacheable;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.CiCustomer;
import com.example.demo.entity.User;

@Mapper
public interface UserDao {


	List<Map<String,Object>> selectUser(User user);
}
