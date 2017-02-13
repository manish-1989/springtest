package com.spring.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	    private long id;
	    private String name;
	    private String description;
	    private float price;
	    private Category category;
	    @Id
	    @Column(name = "PRODUCT_ID")
	    @GeneratedValue
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		@ManyToOne
		@JoinColumn(name="CATEGORY_ID")
		public Category getCategory() {
			return category;
		}
		public void setCategory(Category categoty) {
			category = categoty;
		}
		
}
