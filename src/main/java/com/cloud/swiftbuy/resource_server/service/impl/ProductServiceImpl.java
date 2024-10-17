package com.cloud.swiftbuy.resource_server.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cloud.swiftbuy.resource_server.dto.ProductResponseDTO;
import com.cloud.swiftbuy.resource_server.dto.ProductResponseListDTO;
import com.cloud.swiftbuy.resource_server.model.Product;
import com.cloud.swiftbuy.resource_server.repository.ProductRepository;
import com.cloud.swiftbuy.resource_server.service.ProductService;
import com.cloud.swiftbuy.resource_server.specification.ProductSpecParams;
import com.cloud.swiftbuy.resource_server.specification.ProductSpecificationSearchBrandCategory;

@Service
public class ProductServiceImpl implements ProductService {

	@Value("${pagination.page.size.default}")
	private Integer defaultPageSize;

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ProductSpecificationSearchBrandCategory productSpecificationSearchBrandCategory;

	@Override
	public ProductResponseDTO getProductById(long id) {
		Optional<Product> productOpt = productRepository.findById(id);
		if (productOpt.isPresent()) {
			ProductResponseDTO productResponseDTO = new ProductResponseDTO();
			productResponseDTO.populateDto(productOpt.get());
			return productResponseDTO;
		}
		return null;
	}

	@Override
	public ProductResponseListDTO getProductList(ProductSpecParams specParams) {
		List<Product> productList = null;
		Page<Product> pages = null;

		if (Integer.valueOf(specParams.getPageIndex()) == null || Integer.valueOf(specParams.getPageIndex()) == 0) {
			pages = new PageImpl<Product>(
					productRepository.findAll(productSpecificationSearchBrandCategory.getProducts(specParams)));

		} else {
			if (Integer.valueOf(specParams.getPageSize()) == null || Integer.valueOf(specParams.getPageSize()) == 0) {
				specParams.setPageSize(defaultPageSize);
			}
			Pageable paging = PageRequest.of(specParams.getPageIndex() - 1, specParams.getPageSize());
			pages = productRepository.findAll(productSpecificationSearchBrandCategory.getProducts(specParams), paging);

		}

		if (pages != null && pages.getContent() != null) {
			productList = pages.getContent();
			if (productList != null && productList.size() > 0) {

				ProductResponseListDTO productResponseListDTO = new ProductResponseListDTO();
				productResponseListDTO.setTotalPages(pages.getTotalPages());
				productResponseListDTO.setTotalCount(pages.getTotalElements());
				productResponseListDTO.setPageIndex(pages.getNumber() + 1);
				productResponseListDTO.setPageSize(specParams.getPageSize());
				productResponseListDTO.setProductList(new ArrayList<ProductResponseDTO>());

				for (Product product : productList) {
					ProductResponseDTO productResponseDTO = new ProductResponseDTO();
					productResponseDTO.populateDto(product);
					productResponseListDTO.getProductList().add(productResponseDTO);
				}
				return productResponseListDTO;

			}
		}

		return null;
	}

}
