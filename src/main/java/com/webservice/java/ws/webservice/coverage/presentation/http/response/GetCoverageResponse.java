package com.webservice.java.ws.webservice.coverage.presentation.http.response;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "getCoverageResponse", namespace = "http://coverage.webservice.ws.java.webservice.com/")
public class GetCoverageResponse {
    private String type;
    private Double insuredAmount;
    private String status;

    @XmlElement
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    @XmlElement
    public Double getInsuredAmount() { return insuredAmount; }
    public void setInsuredAmount(Double insuredAmount) { this.insuredAmount = insuredAmount; }

    @XmlElement
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
