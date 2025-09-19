package com.webservice.java.ws.webservice.claim.presentation.http.request;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "getClaimRequest", namespace = "http://claim.webservice.ws.java.webservice.com/")
public class GetClaimRequest {
    private String claimNumber;

    @XmlElement
    public String getClaimNumber() { return claimNumber; }
    public void setClaimNumber(String claimNumber) { this.claimNumber = claimNumber; }
}
