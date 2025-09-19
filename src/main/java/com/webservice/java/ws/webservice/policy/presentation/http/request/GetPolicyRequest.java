package com.webservice.java.ws.webservice.policy.presentation.http.request;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "getPolicyRequest")
/**
 * Model para requisição de consulta de apólice.
 */
public class GetPolicyRequest {
    private String policyNumber;

    @XmlElement
    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }
}
