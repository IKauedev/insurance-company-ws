package com.webservice.java.ws.webservice.coverage.application.service;

import com.webservice.java.ws.webservice.coverage.domain.entity.Coverage;
import com.webservice.java.ws.webservice.coverage.infrastructure.repository.CoverageRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CoverageService {
    private final CoverageRepository coverageRepository;

    public CoverageService(CoverageRepository coverageRepository) {
        this.coverageRepository = coverageRepository;
    }

    @Transactional
    public Coverage createCoverage(String type, Double insuredAmount) {
        Coverage coverage = new Coverage(type, insuredAmount);
        return coverageRepository.save(coverage);
    }

    public Optional<Coverage> getCoverageByType(String type) {
        return coverageRepository.findByType(type);
    }
}
