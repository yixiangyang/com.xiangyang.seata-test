package com.yixiangyang.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import com.yixiangyang.model.Account;

public interface AccountMapper {
	@Insert("insert into account_tbl(id,user_id,money) values(#{a.id},#{a.userId},#{a.money})")
	public void inserAccount(@Param("a")Account account);
	
}
