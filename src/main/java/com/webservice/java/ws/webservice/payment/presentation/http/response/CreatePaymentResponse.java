package com.webservice.java.ws.webservice.payment.presentation.http.response;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "createPaymentResponse", namespace = "http://payment.webservice.ws.java.webservice.com/")
public class CreatePaymentResponse {
    private String status;
    private Long paymentId;

    @XmlElement
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @XmlElement
    public Long getPaymentId() { return paymentId; }
    public void setPaymentId(Long paymentId) { this.paymentId = paymentId; }
}
