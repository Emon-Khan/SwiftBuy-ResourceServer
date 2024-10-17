package com.cloud.swiftbuy.resource_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloud.swiftbuy.resource_server.model.Brand;

public interface BrandRepository extends JpaRepository<Brand, Long> {

}
