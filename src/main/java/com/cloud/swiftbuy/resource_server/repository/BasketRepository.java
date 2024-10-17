package com.cloud.swiftbuy.resource_server.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cloud.swiftbuy.resource_server.model.Basket;

@Repository
public interface BasketRepository extends CrudRepository<Basket, String> {

}
