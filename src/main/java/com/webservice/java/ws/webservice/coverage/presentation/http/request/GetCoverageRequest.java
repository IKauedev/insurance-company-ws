package com.webservice.java.ws.webservice.coverage.presentation.http.request;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "getCoverageRequest", namespace = "http://coverage.webservice.ws.java.webservice.com/")
public class GetCoverageRequest {
    private String type;

    @XmlElement
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
}
