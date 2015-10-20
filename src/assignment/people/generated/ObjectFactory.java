//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.10.20 alle 10:47:17 PM CEST 
//


package assignment.people.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the assignment.people.generated package. 
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

    private final static QName _People_QNAME = new QName("", "people");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: assignment.people.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeopleType }
     * 
     */
    public PeopleType createPeopleType() {
        return new PeopleType();
    }

    /**
     * Create an instance of {@link HealthprofileType }
     * 
     */
    public HealthprofileType createHealthprofileType() {
        return new HealthprofileType();
    }

    /**
     * Create an instance of {@link PersonType }
     * 
     */
    public PersonType createPersonType() {
        return new PersonType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeopleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "people")
    public JAXBElement<PeopleType> createPeople(PeopleType value) {
        return new JAXBElement<PeopleType>(_People_QNAME, PeopleType.class, null, value);
    }

}
