package com.webservice.java.ws.webservice.customer.presentation.http.request;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "createCustomerRequest", namespace = "http://customer.webservice.ws.java.webservice.com/")
public class CreateCustomerRequest {
    private String document;
    private String name;

    @XmlElement
    public String getDocument() { return document; }
    public void setDocument(String document) { this.document = document; }

    @XmlElement
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
