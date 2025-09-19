package com.webservice.java.ws.webservice.payment.presentation.http.request;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "createPaymentRequest", namespace = "http://payment.webservice.ws.java.webservice.com/")
public class CreatePaymentRequest {
    private Double amount;
    private String date;
    private Long policyId;

    @XmlElement
    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    @XmlElement
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    @XmlElement
    public Long getPolicyId() { return policyId; }
    public void setPolicyId(Long policyId) { this.policyId = policyId; }
}
