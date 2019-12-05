package com.xiangyang.vo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderVO {
	private String id;
	
	private Integer userId;
	
	private String commodityCode;
	
	private Integer count;
	
	private Integer money;

	public OrderVO(Integer userId, String commodityCode, Integer count, Integer money) {
		super();
		this.userId = userId;
		this.commodityCode = commodityCode;
		this.count = count;
		this.money = money;
	}

	public OrderVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
