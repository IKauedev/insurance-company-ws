package com.webservice.java.ws.webservice.customer.presentation.http.controller;

import com.webservice.java.ws.webservice.customer.presentation.http.request.CreateCustomerRequest;
import com.webservice.java.ws.webservice.customer.presentation.http.response.CreateCustomerResponse;
import com.webservice.java.ws.webservice.customer.presentation.http.request.GetCustomerRequest;
import com.webservice.java.ws.webservice.customer.presentation.http.response.GetCustomerResponse;
import com.webservice.java.ws.webservice.customer.application.service.CustomerService;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CustomerEndpoint {
    private static final String NAMESPACE_URI = "http://customer.webservice.ws.java.webservice.com/";
    private final CustomerService customerService;

    public CustomerEndpoint(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createCustomerRequest")
    @ResponsePayload
    public CreateCustomerResponse createCustomer(@RequestPayload CreateCustomerRequest request) {
        var customer = customerService.createCustomer(request.getDocument(), request.getName());
        CreateCustomerResponse response = new CreateCustomerResponse();
        response.setStatus("SUCCESS");
        response.setCustomerId(customer.getId());
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCustomerRequest")
    @ResponsePayload
    public GetCustomerResponse getCustomer(@RequestPayload GetCustomerRequest request) {
        return customerService.getCustomerByDocument(request.getDocument())
            .map(c -> {
                GetCustomerResponse resp = new GetCustomerResponse();
                resp.setDocument(c.getDocument());
                resp.setName(c.getName());
                resp.setStatus("FOUND");
                return resp;
            })
            .orElseGet(() -> {
                GetCustomerResponse resp = new GetCustomerResponse();
                resp.setStatus("NOT_FOUND");
                return resp;
            });
    }
}
