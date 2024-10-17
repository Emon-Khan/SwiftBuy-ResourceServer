package com.cloud.swiftbuy.resource_server.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "brand")
@Data
public class Brand {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "brandId")
	private Long brandId;

	@Column(name = "brandName")
	private String brandName;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "brand")
	private Set<Product> products;

	public Brand() {
		super();
	}

	public Brand(String brandName) {
		super();
		this.brandName = brandName;
	}

	public Brand(Long brandId) {
		super();
		this.brandId = brandId;
	}

}
