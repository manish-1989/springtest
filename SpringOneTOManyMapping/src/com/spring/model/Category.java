package com.spring.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	    private long id;
	    private String name;
	    private Set<Product> products;
	    @Id
	    @Column(name = "CATEGORY_ID")
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
		@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
		public Set<Product> getProducts() {
			return products;
		}
		public void setProducts(Set<Product> products) {
			this.products = products;
		}

	    
}
