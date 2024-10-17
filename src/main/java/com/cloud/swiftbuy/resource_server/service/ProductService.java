package com.cloud.swiftbuy.resource_server.service;

import com.cloud.swiftbuy.resource_server.dto.ProductResponseDTO;
import com.cloud.swiftbuy.resource_server.dto.ProductResponseListDTO;
import com.cloud.swiftbuy.resource_server.specification.ProductSpecParams;

public interface ProductService {

	public ProductResponseDTO getProductById(long id);

	public ProductResponseListDTO getProductList(ProductSpecParams specParams);

}
