package com.cloud.swiftbuy.resource_server.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrdersController {
	
	@GetMapping()
	public List<String> getOrders(){
		String[] orders = {"Order1", "Order2", "Order3"};
		return Arrays.asList(orders);
	}

}
