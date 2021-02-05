
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

    private final static QName _SolicitudResponse_QNAME = new QName("http://service.g1.ups/", "solicitudResponse");
    private final static QName _Solicitud_QNAME = new QName("http://service.g1.ups/", "solicitud");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ups.g1.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Solicitud }
     * 
     */
    public Solicitud createSolicitud() {
        return new Solicitud();
    }

    /**
     * Create an instance of {@link SolicitudResponse }
     * 
     */
    public SolicitudResponse createSolicitudResponse() {
        return new SolicitudResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolicitudResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.g1.ups/", name = "solicitudResponse")
    public JAXBElement<SolicitudResponse> createSolicitudResponse(SolicitudResponse value) {
        return new JAXBElement<SolicitudResponse>(_SolicitudResponse_QNAME, SolicitudResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Solicitud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.g1.ups/", name = "solicitud")
    public JAXBElement<Solicitud> createSolicitud(Solicitud value) {
        return new JAXBElement<Solicitud>(_Solicitud_QNAME, Solicitud.class, null, value);
    }

}
