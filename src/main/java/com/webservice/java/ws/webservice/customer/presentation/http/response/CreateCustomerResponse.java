package com.webservice.java.ws.webservice.customer.presentation.http.response;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "createCustomerResponse", namespace = "http://customer.webservice.ws.java.webservice.com/")
public class CreateCustomerResponse {
    private String status;
    private Long customerId;

    @XmlElement
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @XmlElement
    public Long getCustomerId() { return customerId; }
    public void setCustomerId(Long customerId) { this.customerId = customerId; }
}
