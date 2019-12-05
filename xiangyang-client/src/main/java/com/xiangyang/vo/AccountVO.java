package com.xiangyang.vo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AccountVO {
	private Integer id;
	
	private Integer userId;
	
	private Integer money;

	public AccountVO(Integer id, Integer userId, Integer money) {
		super();
		this.id = id;
		this.userId = userId;
		this.money = money;
	}

	public AccountVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
