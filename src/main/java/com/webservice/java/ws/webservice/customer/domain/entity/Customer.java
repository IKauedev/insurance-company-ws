package com.webservice.java.ws.webservice.customer.domain.entity;

import com.webservice.java.ws.webservice.policy.domain.entity.Policy;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String document;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "customer")
    private List<Policy> policies;

    public Customer() {}

    public Customer(String document, String name) {
        this.document = document;
        this.name = name;
    }

    public Long getId() { return id; }
    public String getDocument() { return document; }
    public void setDocument(String document) { this.document = document; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<Policy> getPolicies() { return policies; }
    public void setPolicies(List<Policy> policies) { this.policies = policies; }
}
