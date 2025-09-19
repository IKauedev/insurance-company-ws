package com.webservice.java.ws.webservice.policy.application.service;

import com.webservice.java.ws.webservice.policy.presentation.http.request.CreatePolicyRequest;
import com.webservice.java.ws.webservice.policy.presentation.http.response.CreatePolicyResponse;
import com.webservice.java.ws.webservice.policy.presentation.http.request.GetPolicyRequest;
import com.webservice.java.ws.webservice.policy.presentation.http.response.GetPolicyResponse;
import org.springframework.stereotype.Service;

@Service
public class PolicyService {
    private final PolicyApplicationService applicationService;

    public PolicyService(PolicyApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) {
        var policy = applicationService.createPolicy(request.getPolicyNumber(), request.getHolderName(), request.getData());
        return PolicyAssembler.toCreateResponse(policy);
    }

    public GetPolicyResponse getPolicy(GetPolicyRequest request) {
        return applicationService.getPolicyByNumber(request.getPolicyNumber())
                .map(PolicyAssembler::toGetResponse)
                .orElseGet(() -> {
                    GetPolicyResponse resp = new GetPolicyResponse();
                    resp.setStatus("NOT_FOUND");
                    return resp;
                });
    }
}
