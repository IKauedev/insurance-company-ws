package com.webservice.java.ws.webservice.payment.presentation.http.controller;

import com.webservice.java.ws.webservice.payment.presentation.http.request.CreatePaymentRequest;
import com.webservice.java.ws.webservice.payment.presentation.http.response.CreatePaymentResponse;
import com.webservice.java.ws.webservice.payment.presentation.http.request.GetPaymentRequest;
import com.webservice.java.ws.webservice.payment.presentation.http.response.GetPaymentResponse;
import com.webservice.java.ws.webservice.payment.application.service.PaymentService;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PaymentEndpoint {
    private static final String NAMESPACE_URI = "http://payment.webservice.ws.java.webservice.com/";
    private final PaymentService paymentService;

    public PaymentEndpoint(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createPaymentRequest")
    @ResponsePayload
    public CreatePaymentResponse createPayment(@RequestPayload CreatePaymentRequest request) {
        var payment = paymentService.createPayment(request.getAmount(), request.getDate(), request.getPolicyId());
        CreatePaymentResponse response = new CreatePaymentResponse();
        response.setStatus("SUCCESS");
        response.setPaymentId(payment.getId());
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPaymentRequest")
    @ResponsePayload
    public GetPaymentResponse getPayment(@RequestPayload GetPaymentRequest request) {
        return paymentService.getPaymentById(request.getPaymentId())
            .map(p -> {
                GetPaymentResponse resp = new GetPaymentResponse();
                resp.setAmount(p.getAmount());
                resp.setDate(p.getDate().toString());
                resp.setPolicyId(p.getPolicy().getId());
                resp.setStatus("FOUND");
                return resp;
            })
            .orElseGet(() -> {
                GetPaymentResponse resp = new GetPaymentResponse();
                resp.setStatus("NOT_FOUND");
                return resp;
            });
    }
}
