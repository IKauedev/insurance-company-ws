package com.webservice.java.ws.webservice.payment.domain.entity;

import com.webservice.java.ws.webservice.policy.domain.entity.Policy;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Double amount;

    @Column(nullable = false)
    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "policy_id")
    private Policy policy;

    public Payment() {}

    public Payment(Double amount, LocalDateTime date, Policy policy) {
        this.amount = amount;
        this.date = date;
        this.policy = policy;
    }

    public Long getId() { return id; }
    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }
    public LocalDateTime getDate() { return date; }
    public void setDate(LocalDateTime date) { this.date = date; }
    public Policy getPolicy() { return policy; }
    public void setPolicy(Policy policy) { this.policy = policy; }
}
