package com.cloud.swiftbuy.resource_server.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.cloud.swiftbuy.resource_server.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {
	public Page<Product> findAll(Specification<Product> spec, Pageable pageable);

	public List<Product> findAll(Specification<Product> spec);
}
