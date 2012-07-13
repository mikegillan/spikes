package ca.gillan.jaxwsservice;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.3
 * 2012-07-12T23:56:01.946-04:00
 * Generated source version: 2.4.3
 * 
 */
@WebService(targetNamespace = "http://jaxwsservice.gillan.ca/", name = "ExceptionalService")
@XmlSeeAlso({ObjectFactory.class})
public interface ExceptionalService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "doSomethingExceptional", targetNamespace = "http://jaxwsservice.gillan.ca/", className = "ca.gillan.jaxwsservice.DoSomethingExceptional")
    @WebMethod
    @ResponseWrapper(localName = "doSomethingExceptionalResponse", targetNamespace = "http://jaxwsservice.gillan.ca/", className = "ca.gillan.jaxwsservice.DoSomethingExceptionalResponse")
    public java.lang.String doSomethingExceptional() throws ExceptionalException_Exception;
}