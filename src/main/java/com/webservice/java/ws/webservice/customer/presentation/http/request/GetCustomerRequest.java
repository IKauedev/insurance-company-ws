package com.webservice.java.ws.webservice.customer.presentation.http.request;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "getCustomerRequest", namespace = "http://customer.webservice.ws.java.webservice.com/")
public class GetCustomerRequest {
    private String document;

    @XmlElement
    public String getDocument() { return document; }
    public void setDocument(String document) { this.document = document; }
}
