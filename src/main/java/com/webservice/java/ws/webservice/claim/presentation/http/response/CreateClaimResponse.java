package com.webservice.java.ws.webservice.claim.presentation.http.response;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "createClaimResponse", namespace = "http://claim.webservice.ws.java.webservice.com/")
public class CreateClaimResponse {
    private String status;
    private Long claimId;

    @XmlElement
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @XmlElement
    public Long getClaimId() { return claimId; }
    public void setClaimId(Long claimId) { this.claimId = claimId; }
}
