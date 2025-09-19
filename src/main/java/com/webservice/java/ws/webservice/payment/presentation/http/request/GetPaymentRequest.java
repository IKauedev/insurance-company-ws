package com.webservice.java.ws.webservice.payment.presentation.http.request;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "getPaymentRequest", namespace = "http://payment.webservice.ws.java.webservice.com/")
public class GetPaymentRequest {
    private Long paymentId;

    @XmlElement
    public Long getPaymentId() { return paymentId; }
    public void setPaymentId(Long paymentId) { this.paymentId = paymentId; }
}
