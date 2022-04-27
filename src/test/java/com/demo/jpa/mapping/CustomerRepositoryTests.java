package com.demo.jpa.mapping;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.demo.jpa.mapping.model.Customer;
import com.demo.jpa.mapping.repository.CustomerRepository;

@ExtendWith(SpringExtension.class)
@DataJpaTest
//@SpringBootTest(classes = SpringJpaMappingExample22Application.class)
public class CustomerRepositoryTests {

	@Autowired
	private CustomerRepository customerRepository;

	@BeforeEach
	public void initialize() {
		Customer customer = new Customer();

		customer.setId(123L);
		customer.setName("vijay");
		customer.setEmail("vijay@gmail.com");

		customerRepository.save(customer);

	}

	@Test
	public void saveCustomerTest() {

		Customer customer = new Customer();

		customer.setId(123L);
		customer.setName("vijay");
		customer.setEmail("vijay@gmail.com");

		Customer updatedCustomer = customerRepository.save(customer);

		Assert.assertEquals(updatedCustomer.getId(), 123L);
	}

	@Test
	public void getCustomerTest() {

		Customer customer = customerRepository.findById(123L).get();

		Assert.assertEquals(customer.getId(), 123L);
	}

	@Test
	public void getListOfCustomerTest() {

		List<Customer> customers = customerRepository.findAll();

		Assertions.assertThat(customers.size()).isGreaterThan(0);
	}

	@Test
	public void updateCustomerTest() {

		Customer customer = customerRepository.findById(123L).get();

		customer.setEmail("kumar@gmail.com");

		Customer customerUpdated = customerRepository.save(customer);

		Assertions.assertThat(customerUpdated.getEmail()).isEqualTo("kumar@gmail.com");
	}

}
