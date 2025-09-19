package com.webservice.java.ws.webservice.coverage.presentation.http.request;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "createCoverageRequest", namespace = "http://coverage.webservice.ws.java.webservice.com/")
public class CreateCoverageRequest {
    private String type;
    private Double insuredAmount;

    @XmlElement
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    @XmlElement
    public Double getInsuredAmount() { return insuredAmount; }
    public void setInsuredAmount(Double insuredAmount) { this.insuredAmount = insuredAmount; }
}
