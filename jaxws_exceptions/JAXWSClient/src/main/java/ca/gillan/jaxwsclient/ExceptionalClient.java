/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.gillan.jaxwsclient;

import ca.gillan.jaxwsservice.ExceptionalService;
import ca.gillan.jaxwsservice.ExceptionalServiceService;

/**
 *
 * @author mgillan
 */
public class ExceptionalClient {

    public String getExceptionalMessage() {
        String message;

        ExceptionalServiceService service = new ExceptionalServiceService();
        ExceptionalService port = service.getExceptionalServicePort();
        try {
            message = port.doSomethingExceptional();
        } catch (Exception e) {
            message = "Failed to get something exceptional: " + e.getMessage();
        }

        return message;
    }
}
