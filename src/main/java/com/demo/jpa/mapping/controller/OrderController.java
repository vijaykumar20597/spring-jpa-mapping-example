package com.demo.jpa.mapping.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.jpa.mapping.dto.OrderRequest;
import com.demo.jpa.mapping.dto.OrderResponse;
import com.demo.jpa.mapping.model.Customer;
import com.demo.jpa.mapping.repository.CustomerRepository;

@RestController
public class OrderController {

	private static final Logger log = LoggerFactory.getLogger(OrderController.class);
	@Autowired
	private CustomerRepository customerRepository;

	@PostMapping("/placeOrder")
	public Customer placeOrder(@RequestBody OrderRequest request) {
		
		log.info("In OrderController {}: "+request.getCustomer());
		return customerRepository.save(request.getCustomer());
	
	}

	@GetMapping("/findAllOrders")
	public List<Customer> findAllOrders() {

		log.info("In OrderController {}: "+customerRepository.findAll());
		return customerRepository.findAll();
	}

	@GetMapping("/getInfo")
	public List<OrderResponse> getJoinInformation() {

		log.info("In OrderController {}: "+customerRepository.getJoinInformation());
		return customerRepository.getJoinInformation();
	}
}
