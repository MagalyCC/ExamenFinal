
package ups.g1.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ups.g1.service package. 
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

    private final static QName _Numero_QNAME = new QName("http://service.g1.ups/", "numero");
    private final static QName _NumeroResponse_QNAME = new QName("http://service.g1.ups/", "numeroResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ups.g1.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NumeroResponse }
     * 
     */
    public NumeroResponse createNumeroResponse() {
        return new NumeroResponse();
    }

    /**
     * Create an instance of {@link Numero }
     * 
     */
    public Numero createNumero() {
        return new Numero();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Numero }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.g1.ups/", name = "numero")
    public JAXBElement<Numero> createNumero(Numero value) {
        return new JAXBElement<Numero>(_Numero_QNAME, Numero.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumeroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.g1.ups/", name = "numeroResponse")
    public JAXBElement<NumeroResponse> createNumeroResponse(NumeroResponse value) {
        return new JAXBElement<NumeroResponse>(_NumeroResponse_QNAME, NumeroResponse.class, null, value);
    }

}
