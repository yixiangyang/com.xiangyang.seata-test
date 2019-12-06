package com.csp.tp.client;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xiangyang.vo.OrderVO;


public interface OrderClient {
	/**
	 * 微信支付 统一下单
	 * @return
	 */
	@RequestMapping(value= {"/v1/order"}, method= {RequestMethod.POST})
	public ResponseEntity<Map<String, String>> addOrder(@RequestBody OrderVO orderVO );
	
}
