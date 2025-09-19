package com.webservice.java.ws.webservice.policy.application.service;

import com.webservice.java.ws.webservice.policy.domain.entity.Policy;
import com.webservice.java.ws.webservice.policy.infrastructure.repository.PolicyRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Service
public class PolicyApplicationService {
    private final PolicyRepository policyRepository;

    public PolicyApplicationService(PolicyRepository policyRepository) {
        this.policyRepository = policyRepository;
    }

    @Transactional
    public Policy createPolicy(String policyNumber, String holderName, String data) {
        Policy policy = new Policy(policyNumber, holderName, data);
        return policyRepository.save(policy);
    }

    public Optional<Policy> getPolicyByNumber(String policyNumber) {
        return policyRepository.findByPolicyNumber(policyNumber);
    }
}
