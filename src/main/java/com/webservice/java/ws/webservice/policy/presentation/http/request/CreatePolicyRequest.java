package com.webservice.java.ws.webservice.policy.presentation.http.request;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.Date;

@XmlRootElement(name = "createPolicyRequest", namespace = "http://controller.webservice.ws.java.webservice.com/")
public class CreatePolicyRequest {
    private String policyNumber;
    private String holderName;
    private String data = new Date().toString();

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
}
