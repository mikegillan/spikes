/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.gillan.jaxwsservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author mgillan
 */
@WebService(name = "ExceptionalService")
public interface ExceptionalService {
    
    @WebMethod(operationName = "doSomethingExceptional")
    public String doSomethingExceptional() throws ExceptionalException;
    
}
