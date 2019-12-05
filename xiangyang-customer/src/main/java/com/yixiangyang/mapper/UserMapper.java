package com.yixiangyang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.yixiangyang.model.EmpLogin;
import com.yixiangyang.model.User;

public interface UserMapper {
	@Insert("insert into user(id,name,create_time) values(#{u.id},#{u.name},#{u.createTime})")
	public void inserUser(@Param("u")User user);
	
	@Select("select id,user_no userNo,user_name userName,store_name storeName,dept_name deptName from emp_login")
	public List<EmpLogin> searchUserLogin();
	
	@Select("select * from user order by id asc limit 1,10 ")
	public List<User> getUsers();
	
	@Select("select * from user where id =100006 ")
	public List<User> getUsers2();
	
	@Select("select max(id) from user ")
	public Integer getMaxUserId();
}
