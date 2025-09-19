package com.webservice.java.ws.webservice.payment.infrastructure.repository;

import com.webservice.java.ws.webservice.payment.domain.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
