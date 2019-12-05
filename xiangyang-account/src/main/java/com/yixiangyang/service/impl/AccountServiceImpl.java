package com.yixiangyang.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yixiangyang.mapper.AccountMapper;
import com.yixiangyang.model.Account;
import com.yixiangyang.service.AccountService;
@Service
public class AccountServiceImpl implements AccountService{
	@Resource
	private AccountMapper accountMapper;

	@Override
	public void addAccount(Account account) {
		accountMapper.inserAccount(account);
	}

}
