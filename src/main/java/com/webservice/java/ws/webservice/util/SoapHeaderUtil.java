package com.webservice.java.ws.webservice.util;

import org.springframework.ws.context.MessageContext;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;

import javax.xml.namespace.QName;

public class SoapHeaderUtil {
    public static void addStatusCodeHeader(MessageContext context, String code) {
        SoapMessage soapResponse = (SoapMessage) context.getResponse();
        SoapHeader header = soapResponse.getSoapHeader();
        QName qname = new QName("http://controller.webservice.ws.java.webservice.com/", "StatusCode");
        header.addHeaderElement(qname).setText(code);
    }
}
