package com.webservice.java.ws.webservice.policy.application.service;

import com.webservice.java.ws.webservice.policy.domain.entity.Policy;
import com.webservice.java.ws.webservice.policy.presentation.http.request.CreatePolicyRequest;
import com.webservice.java.ws.webservice.policy.presentation.http.response.CreatePolicyResponse;
import com.webservice.java.ws.webservice.policy.presentation.http.response.GetPolicyResponse;

public class PolicyAssembler {

    public static Policy fromCreateRequest(CreatePolicyRequest request) {
        return new Policy(request.getPolicyNumber(), request.getHolderName(), request.getData());
    }


    public static CreatePolicyResponse toCreateResponse(Policy policy) {
        CreatePolicyResponse response = new CreatePolicyResponse();
        response.setPolicyNumber(policy.getPolicyNumber());
        response.setStatus("SUCCESS");
        return response;
    }

    public static GetPolicyResponse toGetResponse(Policy policy) {
        GetPolicyResponse response = new GetPolicyResponse();
        response.setPolicyNumber(policy.getPolicyNumber());
        response.setHolderName(policy.getHolderName());
        response.setData(policy.getData());
        response.setStatus("FOUND");
        return response;
    }
}
