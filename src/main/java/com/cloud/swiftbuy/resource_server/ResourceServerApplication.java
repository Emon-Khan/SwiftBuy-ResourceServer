package com.cloud.swiftbuy.resource_server;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cloud.swiftbuy.resource_server.model.Brand;
import com.cloud.swiftbuy.resource_server.model.Category;
import com.cloud.swiftbuy.resource_server.model.Product;
import com.cloud.swiftbuy.resource_server.repository.BrandRepository;
import com.cloud.swiftbuy.resource_server.repository.CategoryRepository;
import com.cloud.swiftbuy.resource_server.repository.ProductRepository;

@SpringBootApplication
public class ResourceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResourceServerApplication.class, args);
	}

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private BrandRepository brandRepository;

//	@Bean
//	CommandLineRunner seedDatabase() {
//		return args -> {
//			Brand[] brands = new Brand[] { new Brand("Puma"), new Brand("Reebok"), new Brand("Under Armour") };
//			brandRepository.saveAll(Arrays.asList(brands));
//
//			Category[] cats = { new Category("Football"), new Category("Cricket"), new Category("Badminton") };
//			categoryRepository.saveAll(Arrays.asList(cats));
//
//			Product[] products = {
//					new Product(new Category(2L), new Brand(3L), "B101", "Pro Kicker", "Football boots for champions",
//							210.0, "shoes-1", true, 15, new Date(2023, 5, 10), new Date(2023, 5, 10)),
//
//					new Product(new Category(1L), new Brand(3L), "B102", "Speed Striker",
//							"Cricket shoes for fast bowlers", 320.0, "shoes-2.jpg", true, 10, new Date(2023, 5, 10),
//							new Date(2023, 5, 10)),
//
//					new Product(new Category(3L), new Brand(2L), "B103", "Feather Smash", "Lightweight badminton shoes",
//							150.0, "shoes-3.jpg", true, 20, new Date(2023, 5, 10), new Date(2023, 5, 10)),
//
//					new Product(new Category(1L), new Brand(1L), "B104", "Blaze Runner",
//							"High-performance running shoes", 200.0, "shoes-4.jpg", true, 18, new Date(2023, 5, 10),
//							new Date(2023, 5, 10)),
//
//					new Product(new Category(2L), new Brand(2L), "B105", "Elite Spike",
//							"Cricket spikes for professionals", 180.0, "shoes-5.jpg", true, 22, new Date(2023, 5, 10),
//							new Date(2023, 5, 10)),
//
//					new Product(new Category(3L), new Brand(3L), "B106", "Sky Jumper", "Best shoes for vertical leaps",
//							205.0, "shoes-6.jpg", true, 12, new Date(2023, 5, 10), new Date(2023, 5, 10)),
//
//					new Product(new Category(1L), new Brand(2L), "B107", "Court Dominator",
//							"Master the court with these shoes", 160.0, "shoes-7.jpg", true, 25, new Date(2023, 5, 10),
//							new Date(2023, 5, 10)),
//
//					new Product(new Category(2L), new Brand(1L), "B108", "Champion Strike", "Top-quality cricket shoes",
//							175.0, "shoes-8.jpg", true, 30, new Date(2023, 5, 10), new Date(2023, 5, 10)),
//
//					new Product(new Category(3L), new Brand(1L), "B109", "Smash Pro", "Dominate the badminton court",
//							165.0, "shoes-9.jpg", true, 28, new Date(2023, 5, 10), new Date(2023, 5, 10)),
//
//					new Product(new Category(1L), new Brand(3L), "B110", "Sprint Master",
//							"Ultimate shoes for sprinters", 130.0, "shoes-10.jpg", true, 14, new Date(2023, 5, 10),
//							new Date(2023, 5, 10)),
//
//					new Product(new Category(2L), new Brand(2L), "B111", "Field Warrior",
//							"Dominate the field with these boots", 140.0, "shoes-11.jpg", true, 18,
//							new Date(2023, 5, 10), new Date(2023, 5, 10)),
//
//					new Product(new Category(3L), new Brand(1L), "B112", "Volley King",
//							"Take over the volleyball court", 225.0, "shoes-12.jpg", true, 16, new Date(2023, 5, 10),
//							new Date(2023, 5, 10)),
//
//					new Product(new Category(1L), new Brand(2L), "B113", "Track Titan", "Run faster with these shoes",
//							180.0, "shoes-13.jpg", true, 12, new Date(2023, 5, 10), new Date(2023, 5, 10)),
//
//					new Product(new Category(2L), new Brand(1L), "B114", "Goal Scorer", "Perfect for football stars",
//							160.0, "shoes-14.jpg", true, 20, new Date(2023, 5, 10), new Date(2023, 5, 10)),
//
//					new Product(new Category(3L), new Brand(3L), "B115", "Smash Star", "Badminton shoes for champions",
//							145.0, "shoes-15.jpg", true, 30, new Date(2023, 5, 10), new Date(2023, 5, 10)),
//
//					new Product(new Category(1L), new Brand(2L), "B116", "Victory Sprint", "Reach your top speed",
//							120.0, "shoes-16.jpg", true, 25, new Date(2023, 5, 10), new Date(2023, 5, 10)),
//
//					new Product(new Category(2L), new Brand(3L), "B117", "All-Star Strike",
//							"Best shoes for all-rounders", 190.0, "shoes-17.jpg", true, 15, new Date(2023, 5, 10),
//							new Date(2023, 5, 10)) };
//
//			productRepository.saveAll(Arrays.asList(products));
//		};
//	}

}
