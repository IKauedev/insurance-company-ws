package com.webservice.java.ws.webservice.customer.application.service;

import com.webservice.java.ws.webservice.customer.domain.entity.Customer;
import com.webservice.java.ws.webservice.customer.infrastructure.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Transactional
    public Customer createCustomer(String document, String name) {
        Customer customer = new Customer(document, name);
        return customerRepository.save(customer);
    }

    public Optional<Customer> getCustomerByDocument(String document) {
        return customerRepository.findByDocument(document);
    }
}
