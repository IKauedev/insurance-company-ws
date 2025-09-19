package com.webservice.java.ws.webservice.policy.infrastructure.repository;

import com.webservice.java.ws.webservice.policy.domain.entity.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface PolicyRepository extends JpaRepository<Policy, Long> {
    Optional<Policy> findByPolicyNumber(String policyNumber);
}
