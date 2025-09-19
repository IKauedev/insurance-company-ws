package com.webservice.java.ws.webservice.claim.presentation.http.response;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "getClaimResponse", namespace = "http://claim.webservice.ws.java.webservice.com/")
public class GetClaimResponse {
    private String claimNumber;
    private String description;
    private String date;
    private String status;

    @XmlElement
    public String getClaimNumber() { return claimNumber; }
    public void setClaimNumber(String claimNumber) { this.claimNumber = claimNumber; }

    @XmlElement
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    @XmlElement
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    @XmlElement
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
