package com.demo.jpa.mapping.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Builder;

@Builder
@Entity
public class Customer {

	@Id
	private long id;
	private String name;
	private String email;
	private String gender;

	@OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
	@JoinColumn(name ="cp_fk",referencedColumnName = "id")
	private List<Product> products;

	public Customer() {

	}

	public Customer(Long id, String name, String email, String gender, List<Product> products) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.products = products;
	}

	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", products="
				+ products + "]";
	}

}
