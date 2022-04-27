package com.demo.jpa.mapping.dto;

import org.springframework.stereotype.Component;

import com.demo.jpa.mapping.model.Customer;

@Component
public class OrderRequest {

	private Customer customer;
	
	public OrderRequest() {
		
	}

	public OrderRequest(Customer customer) {
		super();
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "OrderRequest [customer=" + customer + "]";
	}

}
