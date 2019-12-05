package com.yixiangyang.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Account {
	private Integer id;
	
	private Integer userId;
	
	private Integer money;

	public Account( Integer userId, Integer money) {
		super();
		this.userId = userId;
		this.money = money;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
