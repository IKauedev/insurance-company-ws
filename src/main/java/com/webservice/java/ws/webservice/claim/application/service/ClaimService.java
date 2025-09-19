package com.webservice.java.ws.webservice.claim.application.service;

import com.webservice.java.ws.webservice.claim.domain.entity.Claim;
import com.webservice.java.ws.webservice.claim.infrastructure.repository.ClaimRepository;
import com.webservice.java.ws.webservice.policy.domain.entity.Policy;
import com.webservice.java.ws.webservice.policy.infrastructure.repository.PolicyRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class ClaimService {
    private final ClaimRepository claimRepository;
    private final PolicyRepository policyRepository;

    public ClaimService(ClaimRepository claimRepository, PolicyRepository policyRepository) {
        this.claimRepository = claimRepository;
        this.policyRepository = policyRepository;
    }

    @Transactional
    public Claim createClaim(String claimNumber, String description, String date, Long policyId) {
        Policy policy = policyRepository.findById(policyId).orElseThrow(() -> new IllegalArgumentException("Policy not found"));
        Claim claim = new Claim(claimNumber, description, LocalDateTime.parse(date), policy);
        return claimRepository.save(claim);
    }

    public Optional<Claim> getClaimByNumber(String claimNumber) {
        return claimRepository.findByClaimNumber(claimNumber);
    }
}
