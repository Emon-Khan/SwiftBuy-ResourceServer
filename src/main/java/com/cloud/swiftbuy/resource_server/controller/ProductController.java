package com.cloud.swiftbuy.resource_server.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.swiftbuy.resource_server.dto.ProductResponseDTO;
import com.cloud.swiftbuy.resource_server.dto.ProductResponseListDTO;
import com.cloud.swiftbuy.resource_server.model.Brand;
import com.cloud.swiftbuy.resource_server.model.Category;
import com.cloud.swiftbuy.resource_server.repository.BrandRepository;
import com.cloud.swiftbuy.resource_server.repository.CategoryRepository;
import com.cloud.swiftbuy.resource_server.repository.ProductRepository;
import com.cloud.swiftbuy.resource_server.service.ProductService;
import com.cloud.swiftbuy.resource_server.specification.ProductSpecParams;

@RestController
@RequestMapping("/api/shop")
public class ProductController {

	@Autowired
	CategoryRepository categoryRepository;
	@Autowired
	BrandRepository brandRepository;
	@Autowired
	ProductService productService;

	@GetMapping("/categories")
	public ResponseEntity<List<Category>> getCategories() {
		List<Category> listCategories = categoryRepository.findAll();
		return new ResponseEntity<List<Category>>(listCategories, HttpStatus.OK);
	}

	@GetMapping("/brands")
	public ResponseEntity<List<Brand>> getBrands() {
		List<Brand> listBrands = brandRepository.findAll();
		return new ResponseEntity<List<Brand>>(listBrands, HttpStatus.OK);
	}

	@GetMapping("/products")
	public ResponseEntity<ProductResponseListDTO> getProducts(ProductSpecParams specParams) {
		ProductResponseListDTO productList = productService.getProductList(specParams);
		return ResponseEntity.ok(productList);
	}

	@GetMapping("/products/{id}")
	public ResponseEntity<ProductResponseDTO> getProductById(@PathVariable long id) {
		ProductResponseDTO product = productService.getProductById(id);
		return ResponseEntity.ok(product);
	}
}
