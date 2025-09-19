package com.webservice.java.ws.webservice.payment.presentation.http.response;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "getPaymentResponse", namespace = "http://payment.webservice.ws.java.webservice.com/")
public class GetPaymentResponse {
    private Double amount;
    private String date;
    private Long policyId;
    private String status;

    @XmlElement
    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    @XmlElement
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    @XmlElement
    public Long getPolicyId() { return policyId; }
    public void setPolicyId(Long policyId) { this.policyId = policyId; }

    @XmlElement
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
