package com.cloud.swiftbuy.resource_server.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class ProductResponseListDTO {
	private int totalPages;
	private long totalCount;
	private int pageIndex;
	private int pageSize;
	private List<ProductResponseDTO> productList;

	public ProductResponseListDTO() {
		productList = new ArrayList<>();
	}

}
