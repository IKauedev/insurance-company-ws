package com.webservice.java.ws.webservice.claim.domain.entity;

import com.webservice.java.ws.webservice.policy.domain.entity.Policy;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "claims")
public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String claimNumber;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "policy_id")
    private Policy policy;

    public Claim() {}

    public Claim(String claimNumber, String description, LocalDateTime date, Policy policy) {
        this.claimNumber = claimNumber;
        this.description = description;
        this.date = date;
        this.policy = policy;
    }

    public Long getId() { return id; }
    public String getClaimNumber() { return claimNumber; }
    public void setClaimNumber(String claimNumber) { this.claimNumber = claimNumber; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public LocalDateTime getDate() { return date; }
    public void setDate(LocalDateTime date) { this.date = date; }
    public Policy getPolicy() { return policy; }
    public void setPolicy(Policy policy) { this.policy = policy; }
}
