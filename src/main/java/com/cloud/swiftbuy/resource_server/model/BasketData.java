package com.cloud.swiftbuy.resource_server.model;

import java.util.List;

import lombok.Data;
import lombok.NonNull;

@Data
public class BasketData {
	@NonNull
	private String id;
	private List<BasketItem> items;
	public BasketData() {}
}
