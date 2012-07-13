
package ca.gillan.jaxwsservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.4.3
 * 2012-07-12T23:56:01.888-04:00
 * Generated source version: 2.4.3
 */

@WebFault(name = "ExceptionalException", targetNamespace = "http://jaxwsservice.gillan.ca/")
public class ExceptionalException_Exception extends Exception {
    
    private ca.gillan.jaxwsservice.ExceptionalException exceptionalException;

    public ExceptionalException_Exception() {
        super();
    }
    
    public ExceptionalException_Exception(String message) {
        super(message);
    }
    
    public ExceptionalException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionalException_Exception(String message, ca.gillan.jaxwsservice.ExceptionalException exceptionalException) {
        super(message);
        this.exceptionalException = exceptionalException;
    }

    public ExceptionalException_Exception(String message, ca.gillan.jaxwsservice.ExceptionalException exceptionalException, Throwable cause) {
        super(message, cause);
        this.exceptionalException = exceptionalException;
    }

    public ca.gillan.jaxwsservice.ExceptionalException getFaultInfo() {
        return this.exceptionalException;
    }
}