package com.yixiangyang.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Order {
	private String id;
	
	private Integer userId;
	
	private String commodityCode;
	
	private Integer count;
	
	private Integer money;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(Integer userId, String commodityCode, Integer count, Integer money) {
		super();
		this.userId = userId;
		this.commodityCode = commodityCode;
		this.count = count;
		this.money = money;
	}
	
}
