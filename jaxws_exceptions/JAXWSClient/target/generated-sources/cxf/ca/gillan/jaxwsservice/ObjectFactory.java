
package ca.gillan.jaxwsservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ca.gillan.jaxwsservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DoSomethingExceptional_QNAME = new QName("http://jaxwsservice.gillan.ca/", "doSomethingExceptional");
    private final static QName _ExceptionalException_QNAME = new QName("http://jaxwsservice.gillan.ca/", "ExceptionalException");
    private final static QName _DoSomethingExceptionalResponse_QNAME = new QName("http://jaxwsservice.gillan.ca/", "doSomethingExceptionalResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ca.gillan.jaxwsservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExceptionalException }
     * 
     */
    public ExceptionalException createExceptionalException() {
        return new ExceptionalException();
    }

    /**
     * Create an instance of {@link DoSomethingExceptional }
     * 
     */
    public DoSomethingExceptional createDoSomethingExceptional() {
        return new DoSomethingExceptional();
    }

    /**
     * Create an instance of {@link DoSomethingExceptionalResponse }
     * 
     */
    public DoSomethingExceptionalResponse createDoSomethingExceptionalResponse() {
        return new DoSomethingExceptionalResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoSomethingExceptional }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxwsservice.gillan.ca/", name = "doSomethingExceptional")
    public JAXBElement<DoSomethingExceptional> createDoSomethingExceptional(DoSomethingExceptional value) {
        return new JAXBElement<DoSomethingExceptional>(_DoSomethingExceptional_QNAME, DoSomethingExceptional.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionalException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxwsservice.gillan.ca/", name = "ExceptionalException")
    public JAXBElement<ExceptionalException> createExceptionalException(ExceptionalException value) {
        return new JAXBElement<ExceptionalException>(_ExceptionalException_QNAME, ExceptionalException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoSomethingExceptionalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxwsservice.gillan.ca/", name = "doSomethingExceptionalResponse")
    public JAXBElement<DoSomethingExceptionalResponse> createDoSomethingExceptionalResponse(DoSomethingExceptionalResponse value) {
        return new JAXBElement<DoSomethingExceptionalResponse>(_DoSomethingExceptionalResponse_QNAME, DoSomethingExceptionalResponse.class, null, value);
    }

}
