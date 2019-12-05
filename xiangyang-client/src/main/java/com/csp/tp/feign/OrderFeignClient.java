package com.csp.tp.feign;


import org.springframework.cloud.openfeign.FeignClient;

import com.csp.tp.client.OrderClient;


@FeignClient(name = "xiangyang-order",url = "http://localhost:10006")
public interface OrderFeignClient extends OrderClient {

}
