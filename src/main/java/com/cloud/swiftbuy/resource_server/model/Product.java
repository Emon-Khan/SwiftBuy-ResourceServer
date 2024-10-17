package com.cloud.swiftbuy.resource_server.model;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product")
@Data
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "productId")
	private Long productId;

	@Column(name = "sku")
	private String sku;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "unitPrice")
	private double unitPrice;

	@Column(name = "imageUri")
	private String imageUrl;

	@Column(name = "active")
	private boolean active;

	@Column(name = "unitsInStock")
	private int unitsInStock;

	@Column(name = "dateCreated")
	@CreationTimestamp
	private Date dateCreated;

	@Column(name = "lastUpdated")
	@UpdateTimestamp
	private Date lastUpdated;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "categoryId", nullable = false)
	private Category category;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "brandId", nullable = false)
	private Brand brand;

	public Product() {
		super();
	}

	public Product(Category category, Brand brand, String sku, String title, String description, double unitPrice,
			String imageUrl, boolean active, int unitsInStock, Date date, Date date2) {
		super();
		this.sku = sku;
		this.title = title;
		this.description = description;
		this.unitPrice = unitPrice;
		this.imageUrl = imageUrl;
		this.active = active;
		this.unitsInStock = unitsInStock;
		this.dateCreated = date;
		this.lastUpdated = date2;
		this.category = category;
		this.brand = brand;
	}

}
