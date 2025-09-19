
package com.webservice.java.ws.webservice.policy.presentation.http.controller;

import com.webservice.java.ws.webservice.policy.presentation.http.request.CreatePolicyRequest;
import com.webservice.java.ws.webservice.policy.presentation.http.response.CreatePolicyResponse;
import com.webservice.java.ws.webservice.policy.presentation.http.request.GetPolicyRequest;
import com.webservice.java.ws.webservice.policy.presentation.http.response.GetPolicyResponse;
import com.webservice.java.ws.webservice.policy.application.service.PolicyService;
import com.webservice.java.ws.webservice.util.SoapHeaderUtil;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Endpoint SOAP responsável por expor operações de apólice.
 * Camada de apresentação, recebe requisições e delega para o serviço.
 * Arquitetura desacoplada: PolicyEndpoint -> PolicyService -> Models
 */
@Endpoint
public class PolicyEndpoint {
    private static final String NAMESPACE_URI = "http://controller.webservice.ws.java.webservice.com/";

    // Injeção do serviço de apólice (camada de negócio)
    private final PolicyService policyService;

    /**
     * Construtor com injeção de dependência.
     * @param policyService serviço de apólice
     */
    public PolicyEndpoint(PolicyService policyService) {
        this.policyService = policyService;
    }

    /**
     * Consulta uma apólice pelo ID.
     * @param request dados da requisição
     * @return resposta com dados da apólice
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPolicyRequest")
    @ResponsePayload
    public GetPolicyResponse getPolicy(@RequestPayload GetPolicyRequest request, MessageContext context) {
        GetPolicyResponse response = policyService.getPolicy(request);
        SoapHeaderUtil.addStatusCodeHeader(context, response.getStatus());
        return response;
    }

    /**
     * Cria uma nova apólice.
     * @param request dados da requisição
     * @return resposta com status e id da apólice
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createPolicyRequest")
    @ResponsePayload
    public CreatePolicyResponse createPolicy(@RequestPayload CreatePolicyRequest request, MessageContext context) {
        CreatePolicyResponse response = policyService.createPolicy(request);
        SoapHeaderUtil.addStatusCodeHeader(context, response.getStatus());
        return response;
    }
}
