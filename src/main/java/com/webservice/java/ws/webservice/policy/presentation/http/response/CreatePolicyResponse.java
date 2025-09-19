package com.webservice.java.ws.webservice.policy.presentation.http.response;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "createPolicyResponse")
/**
 * Model para resposta de criação de apólice.
 */
public class CreatePolicyResponse {
    private String policyNumber;
    private String status;

    @XmlElement
    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    @XmlElement
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
