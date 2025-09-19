package com.webservice.java.ws.webservice.coverage.infrastructure.repository;

import com.webservice.java.ws.webservice.coverage.domain.entity.Coverage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoverageRepository extends JpaRepository<Coverage, Long> {
}
