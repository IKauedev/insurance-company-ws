package com.webservice.java.ws.webservice.customer.presentation.http.response;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "getCustomerResponse", namespace = "http://customer.webservice.ws.java.webservice.com/")
public class GetCustomerResponse {
    private String document;
    private String name;
    private String status;

    @XmlElement
    public String getDocument() { return document; }
    public void setDocument(String document) { this.document = document; }

    @XmlElement
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @XmlElement
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
