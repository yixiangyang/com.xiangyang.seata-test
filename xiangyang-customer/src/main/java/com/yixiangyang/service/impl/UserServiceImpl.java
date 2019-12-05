package com.yixiangyang.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.yixiangyang.mapper.UserMapper;
import com.yixiangyang.model.EmpLogin;
import com.yixiangyang.model.User;
import com.yixiangyang.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserMapper userMapper;
	@Override
	public void addUser() {
//		HintManager.getInstance().setMasterRouteOnly();
		Date createTime = new Date(System.currentTimeMillis());
		Integer ad = userMapper.getMaxUserId();
		Integer id = ad+1;
		User user = new User(id,"向阳test1", createTime);
		userMapper.inserUser(user);
		userMapper.getUsers();
	}


	@Override
	public List<User> getUsers() {
		List<User> users = userMapper.getUsers();
		return users;
	}

	@Override
	public List<User> getSlave() {
		List<User> users = userMapper.getUsers2();
		return users;
	}

}
