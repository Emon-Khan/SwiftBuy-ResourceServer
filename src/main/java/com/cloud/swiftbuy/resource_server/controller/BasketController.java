package com.cloud.swiftbuy.resource_server.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.swiftbuy.resource_server.model.Basket;
import com.cloud.swiftbuy.resource_server.model.BasketData;
import com.cloud.swiftbuy.resource_server.repository.BasketRepository;

@RestController
@RequestMapping("/basket")
public class BasketController {
	@Autowired
	BasketRepository basketRepository;

	@PostMapping()
	public ResponseEntity<Basket> createBasket(@RequestBody BasketData basketData) {

		Basket basket = new Basket(basketData.getId());
		basket.setItems(basketData.getItems());
		basketRepository.save(basket);
		return ResponseEntity.ok(basket);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Basket> getBasket(@PathVariable String id) {
		Optional<Basket> basketOpt = basketRepository.findById(id);

		if (basketOpt.isPresent()) {
			return ResponseEntity.ok(basketOpt.get());
		} else
			return ResponseEntity.notFound().build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteBasket(@PathVariable String id) {
		Optional<Basket> basketOpt = basketRepository.findById(id);
		if (basketOpt.isPresent()) {
			basketRepository.delete(basketOpt.get());
			return ResponseEntity.ok(id);
		}
		return ResponseEntity.notFound().build();

	}
}