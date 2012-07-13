/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.gillan.jaxwsservice;

/**
 *
 * @author mgillan
 */
public class ExceptionalServiceImpl implements ExceptionalService {

    public String doSomethingExceptional() throws ExceptionalException {
        System.out.println("I'm about to do something exceptional!");
        throw new ExceptionalException("Huzzah!");
    }
    
}
