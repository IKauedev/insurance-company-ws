package com.webservice.java.ws.webservice.claim.presentation.http.controller;

import com.webservice.java.ws.webservice.claim.presentation.http.request.CreateClaimRequest;
import com.webservice.java.ws.webservice.claim.presentation.http.response.CreateClaimResponse;
import com.webservice.java.ws.webservice.claim.presentation.http.request.GetClaimRequest;
import com.webservice.java.ws.webservice.claim.presentation.http.response.GetClaimResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ClaimEndpoint {
    private static final String NAMESPACE_URI = "http://claim.webservice.ws.java.webservice.com/";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createClaimRequest")
    @ResponsePayload
    public CreateClaimResponse createClaim(@RequestPayload CreateClaimRequest request) {
        // TODO: Implementar lógica de criação de sinistro
        CreateClaimResponse response = new CreateClaimResponse();
        response.setStatus("SUCCESS");
        response.setClaimId(1L); // Exemplo
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getClaimRequest")
    @ResponsePayload
    public GetClaimResponse getClaim(@RequestPayload GetClaimRequest request) {
        // TODO: Implementar lógica de consulta de sinistro
        GetClaimResponse response = new GetClaimResponse();
        response.setClaimNumber("C123");
        response.setDescription("Exemplo de sinistro");
        response.setDate("2025-09-19");
        response.setStatus("FOUND");
        return response;
    }
}
