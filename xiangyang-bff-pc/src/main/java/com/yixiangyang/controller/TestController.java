package com.yixiangyang.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.csp.tp.client.AccountClient;
import com.csp.tp.client.OrderClient;
import com.xiangyang.vo.AccountVO;
import com.xiangyang.vo.OrderVO;

import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;

@RestController
public class TestController {
	@Resource
	private OrderClient orderClient;
	@Resource
	private AccountClient accountClient;
	
	
	@RequestMapping(value = "/v1/aa",method = RequestMethod.POST)
	@GlobalTransactional
	@Transactional(rollbackFor = Exception.class)
	public String getTest(@RequestBody Map<String, String> map){
		String txId = RootContext.getXID();
		System.out.println("这个是 ================"+txId);
		Integer userId = Integer.valueOf(map.get("userId"));
		String commodityCode = map.get("commodityCode");
		Integer count = Integer.valueOf(map.get("count"));
		Integer money = Integer.valueOf(map.get("money"));
		OrderVO orderVO = new OrderVO(userId, commodityCode, count, money);
		AccountVO accountVO = new AccountVO(null, userId, money);
		accountClient.addAccount(accountVO);
		orderClient.addOrder(orderVO);
		
		return "aaa";
	}
	
	
	@GetMapping("/v1/test")
	public String getString() {
		return accountClient.getString();
	}
}
