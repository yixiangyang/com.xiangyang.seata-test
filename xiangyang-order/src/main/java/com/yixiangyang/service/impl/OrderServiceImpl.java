package com.yixiangyang.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.yixiangyang.mapper.OrderMapper;
import com.yixiangyang.model.Order;
import com.yixiangyang.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService{
	@Resource
	private OrderMapper orderMapper;

	@Override
	public void addOrder(Order order) {
		orderMapper.inserOrder(order);
		
	}

}
