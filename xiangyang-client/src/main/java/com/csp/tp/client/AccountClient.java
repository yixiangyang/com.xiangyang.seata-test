package com.csp.tp.client;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xiangyang.vo.AccountVO;

@org.springframework.cloud.netflix.feign.FeignClient(name = "xiangyang-account" ,url = "http://localhost:10005")
public interface AccountClient {
	
	@RequestMapping(value= {"/v1/account"}, method= {RequestMethod.POST})
	public ResponseEntity<Map<String, String>> addAccount(@RequestBody AccountVO accountVO );
	
	@GetMapping("/v1/test")
	public String getString ();
	
}
