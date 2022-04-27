package com.demo.jpa.mapping.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.jpa.mapping.dto.OrderResponse;
import com.demo.jpa.mapping.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	@Query("SELECT new com.demo.jpa.mapping.dto.OrderResponse(c.name, p.productName) FROM Customer c JOIN c.products p")
	public List<OrderResponse> getJoinInformation();

	Optional<Customer> findByEmail(String email);

}
