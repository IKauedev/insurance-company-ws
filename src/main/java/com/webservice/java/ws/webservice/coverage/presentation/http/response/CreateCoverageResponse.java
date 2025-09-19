package com.webservice.java.ws.webservice.coverage.presentation.http.response;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "createCoverageResponse", namespace = "http://coverage.webservice.ws.java.webservice.com/")
public class CreateCoverageResponse {
    private String status;
    private Long coverageId;

    @XmlElement
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @XmlElement
    public Long getCoverageId() { return coverageId; }
    public void setCoverageId(Long coverageId) { this.coverageId = coverageId; }
}
