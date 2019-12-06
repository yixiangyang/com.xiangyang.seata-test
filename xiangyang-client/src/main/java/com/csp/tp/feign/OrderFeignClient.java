package com.csp.tp.feign;



import com.csp.tp.client.OrderClient;


@org.springframework.cloud.netflix.feign.FeignClient(name = "xiangyang-order",url = "http://localhost:10006")
public interface OrderFeignClient extends OrderClient {

}
