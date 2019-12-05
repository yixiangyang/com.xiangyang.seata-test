package com.yixiangyang.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.csp.tp.client.AccountClient;
import com.xiangyang.vo.AccountVO;
import com.yixiangyang.model.Account;
import com.yixiangyang.service.AccountService;

@RestController
public class AccountController implements AccountClient{
	@Resource
	private AccountService accountService;

	@Override
	@RequestMapping(value= {"/v1/account"}, method= {RequestMethod.POST})
	public ResponseEntity<Map<String, String>> addAccount(@RequestBody AccountVO accountVO ) {
		Account account = new Account(accountVO.getUserId(), accountVO.getMoney());
		accountService.addAccount(account);
		return null;
	}

	@Override
	@GetMapping("/v1/test")
	public String getString() {
		// TODO Auto-generated method stub
		return "ggggggggggggggggggggg";
	}
	
	
}
