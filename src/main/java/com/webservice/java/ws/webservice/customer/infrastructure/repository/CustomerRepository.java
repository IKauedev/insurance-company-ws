package com.webservice.java.ws.webservice.customer.infrastructure.repository;

import com.webservice.java.ws.webservice.customer.domain.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByDocument(String document);
}
