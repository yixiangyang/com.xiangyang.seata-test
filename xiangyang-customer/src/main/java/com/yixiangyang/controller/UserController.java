package com.yixiangyang.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yixiangyang.model.User;
import com.yixiangyang.service.UserService;

@RestController
public class UserController {
	@Value("${aa}")
	private String aa;
	@Resource
	private UserService userService;
	
	@RequestMapping(value = "/v1/aa",method = RequestMethod.GET)
	public String getTest(){
		userService.addUser();
		return "aaa";
	}
	
	@RequestMapping(value = "/v1/users",method = RequestMethod.GET)
	public List<User> getUsers(){
//		userService.addUser();
		return userService.getUsers();
	}
	
	@RequestMapping(value = "/v1/user",method = RequestMethod.GET)
	public List<User> getUsersS(){
		System.out.println("ddddddddd:"+aa);
//		userService.addUser();
		return userService.getSlave();
	}
}
