package com.webservice.java.ws.webservice.coverage.presentation.http.controller;

import com.webservice.java.ws.webservice.coverage.presentation.http.request.CreateCoverageRequest;
import com.webservice.java.ws.webservice.coverage.presentation.http.response.CreateCoverageResponse;
import com.webservice.java.ws.webservice.coverage.presentation.http.request.GetCoverageRequest;
import com.webservice.java.ws.webservice.coverage.presentation.http.response.GetCoverageResponse;
import com.webservice.java.ws.webservice.coverage.application.service.CoverageService;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CoverageEndpoint {
    private static final String NAMESPACE_URI = "http://coverage.webservice.ws.java.webservice.com/";
    private final CoverageService coverageService;

    public CoverageEndpoint(CoverageService coverageService) {
        this.coverageService = coverageService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createCoverageRequest")
    @ResponsePayload
    public CreateCoverageResponse createCoverage(@RequestPayload CreateCoverageRequest request) {
        var coverage = coverageService.createCoverage(request.getType(), request.getInsuredAmount());
        CreateCoverageResponse response = new CreateCoverageResponse();
        response.setStatus("SUCCESS");
        response.setCoverageId(coverage.getId());
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCoverageRequest")
    @ResponsePayload
    public GetCoverageResponse getCoverage(@RequestPayload GetCoverageRequest request) {
        return coverageService.getCoverageByType(request.getType())
            .map(c -> {
                GetCoverageResponse resp = new GetCoverageResponse();
                resp.setType(c.getType());
                resp.setInsuredAmount(c.getInsuredAmount());
                resp.setStatus("FOUND");
                return resp;
            })
            .orElseGet(() -> {
                GetCoverageResponse resp = new GetCoverageResponse();
                resp.setStatus("NOT_FOUND");
                return resp;
            });
    }
}
