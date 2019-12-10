package com.yixiangyang.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.aspectj.apache.bcel.classfile.CodeException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.csp.tp.client.OrderClient;
import com.xiangyang.vo.OrderVO;
import com.yixiangyang.model.Order;
import com.yixiangyang.service.OrderService;

import io.netty.handler.codec.CodecException;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;

@RestController
public class OrderController implements OrderClient{
	@Resource
	private OrderService orderService;
	
	@Override
	@RequestMapping(value= {"/v1/order"}, method= {RequestMethod.POST})
   
	public ResponseEntity<Map<String, String>> addOrder(@RequestBody OrderVO orderVO ){
		System.out.println("---------"+RootContext.getXID());
		Order order = new Order(orderVO.getUserId(), orderVO.getCommodityCode(), orderVO.getCount(),orderVO.getMoney());
		if(orderVO.getId()==null) {
			throw new CodecException("这个出错了");
		}
		orderService.addOrder(order);
		return null;
	}

	@RequestMapping(value= {"/v1/order"}, method= {RequestMethod.GET})
	@Override
	public String getOrderAA() {
		
		return "这个是服务33333333333333333333";
	}
	
}
