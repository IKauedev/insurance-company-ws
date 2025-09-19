package com.webservice.java.ws.webservice.policy.presentation.http.response;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "getPolicyResponse")
/**
 * Model para resposta de consulta de apólice.
 */
public class GetPolicyResponse {
    private String policyNumber;
    private String holderName;
    private String data;
    private String status;

    @XmlElement
    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    @XmlElement
    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    @XmlElement
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @XmlElement
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}