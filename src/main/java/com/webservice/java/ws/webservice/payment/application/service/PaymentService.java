package com.webservice.java.ws.webservice.payment.application.service;

import com.webservice.java.ws.webservice.payment.domain.entity.Payment;
import com.webservice.java.ws.webservice.payment.infrastructure.repository.PaymentRepository;
import com.webservice.java.ws.webservice.policy.domain.entity.Policy;
import com.webservice.java.ws.webservice.policy.infrastructure.repository.PolicyRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class PaymentService {
    private final PaymentRepository paymentRepository;
    private final PolicyRepository policyRepository;

    public PaymentService(PaymentRepository paymentRepository, PolicyRepository policyRepository) {
        this.paymentRepository = paymentRepository;
        this.policyRepository = policyRepository;
    }

    @Transactional
    public Payment createPayment(Double amount, String date, Long policyId) {
        Policy policy = policyRepository.findById(policyId).orElseThrow(() -> new IllegalArgumentException("Policy not found"));
        Payment payment = new Payment(amount, LocalDateTime.parse(date), policy);
        return paymentRepository.save(payment);
    }

    public Optional<Payment> getPaymentById(Long id) {
        return paymentRepository.findById(id);
    }
}
