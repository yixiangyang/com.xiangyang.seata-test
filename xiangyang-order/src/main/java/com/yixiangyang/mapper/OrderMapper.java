package com.yixiangyang.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import com.yixiangyang.model.Order;

public interface OrderMapper {
	@Insert("insert into order_tbl(id,user_id,commodity_code,count,money)"
			+ " values(#{o.id},#{o.userId},#{o.commodityCode},#{o.count},#{o.money})")
	public void inserOrder(@Param("o")Order order);
	
}
