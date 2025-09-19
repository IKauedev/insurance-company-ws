package com.webservice.java.ws.webservice.claim.infrastructure.repository;

import com.webservice.java.ws.webservice.claim.domain.entity.Claim;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClaimRepository extends JpaRepository<Claim, Long> {
	Optional<Claim> findByClaimNumber(String claimNumber);
}
