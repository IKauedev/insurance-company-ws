package com.webservice.java.ws.webservice.claim.presentation.http.request;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "createClaimRequest", namespace = "http://claim.webservice.ws.java.webservice.com/")
public class CreateClaimRequest {
    private String claimNumber;
    private String description;
    private String date;
    private Long policyId;

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
    public Long getPolicyId() { return policyId; }
    public void setPolicyId(Long policyId) { this.policyId = policyId; }
}
