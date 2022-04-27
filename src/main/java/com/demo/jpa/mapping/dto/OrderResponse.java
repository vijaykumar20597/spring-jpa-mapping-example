package com.demo.jpa.mapping.dto;

import org.springframework.stereotype.Component;

@Component
public class OrderResponse {

	private String name;
	private String productName;
	
	public OrderResponse() {
		
	}
	
	public OrderResponse(String name, String productName) {
		super();
		this.name = name;
		this.productName = productName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	@Override
	public String toString() {
		return "OrderResponse [name=" + name + ", productName=" + productName + "]";
	}

}
