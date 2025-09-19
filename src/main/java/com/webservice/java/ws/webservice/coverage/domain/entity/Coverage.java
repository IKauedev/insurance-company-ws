package com.webservice.java.ws.webservice.coverage.domain.entity;

import com.webservice.java.ws.webservice.policy.domain.entity.Policy;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "coverages")
public class Coverage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private Double insuredAmount;

    @ManyToMany(mappedBy = "coverages")
    private List<Policy> policies;

    public Coverage() {}

    public Coverage(String type, Double insuredAmount) {
        this.type = type;
        this.insuredAmount = insuredAmount;
    }

    public Long getId() { return id; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public Double getInsuredAmount() { return insuredAmount; }
    public void setInsuredAmount(Double insuredAmount) { this.insuredAmount = insuredAmount; }
    public List<Policy> getPolicies() { return policies; }
    public void setPolicies(List<Policy> policies) { this.policies = policies; }
}
