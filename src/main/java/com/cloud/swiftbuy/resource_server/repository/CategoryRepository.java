package com.cloud.swiftbuy.resource_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloud.swiftbuy.resource_server.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
