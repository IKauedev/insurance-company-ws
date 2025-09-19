package com.webservice.java.ws.webservice.policy.domain.entity;
import java.util.List;

import com.webservice.java.ws.webservice.coverage.domain.entity.Coverage;
import com.webservice.java.ws.webservice.customer.domain.entity.Customer;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "policies")
public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(nullable = false, unique = true)
    private String policyNumber;

    @Column(nullable = false)
    private String holderName;

    @ManyToMany
    @JoinTable(
    name = "policy_coverage",
    joinColumns = @JoinColumn(name = "policy_id"),
    inverseJoinColumns = @JoinColumn(name = "coverage_id")
    )
    private List<Coverage> coverages;

    public List<Coverage> getCoverages() { return coverages; }
    public void setCoverages(List<Coverage> coverages) { this.coverages = coverages; }

    @Column(nullable = false)
    private String data;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    public Policy() {}

    public Policy(String policyNumber, String holderName, String data) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.data = data;
        this.createdAt = LocalDateTime.now();
    }

    public Long getId() { return id; }
    public String getPolicyNumber() { return policyNumber; }
    public void setPolicyNumber(String policyNumber) { this.policyNumber = policyNumber; }
    public String getHolderName() { return holderName; }
    public void setHolderName(String holderName) { this.holderName = holderName; }
    public String getData() { return data; }
    public void setData(String data) { this.data = data; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }
}
