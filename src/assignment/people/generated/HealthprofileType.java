//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.10.20 alle 10:47:17 PM CEST 
//


package assignment.people.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per healthprofileType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="healthprofileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lastupdate" type="{}dateType"/>
 *         &lt;element name="weight" type="{}doubleType"/>
 *         &lt;element name="height" type="{}doubleType"/>
 *         &lt;element name="bmi" type="{}doubleType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "healthprofileType", propOrder = {
    "lastupdate",
    "weight",
    "height",
    "bmi"
})
public class HealthprofileType {

    @XmlElement(required = true)
    protected XMLGregorianCalendar lastupdate;
    protected double weight;
    protected double height;
    protected double bmi;

    /**
     * Recupera il valore della proprietà lastupdate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastupdate() {
        return lastupdate;
    }

    /**
     * Imposta il valore della proprietà lastupdate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastupdate(XMLGregorianCalendar value) {
        this.lastupdate = value;
    }

    /**
     * Recupera il valore della proprietà weight.
     * 
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Imposta il valore della proprietà weight.
     * 
     */
    public void setWeight(double value) {
        this.weight = value;
    }

    /**
     * Recupera il valore della proprietà height.
     * 
     */
    public double getHeight() {
        return height;
    }

    /**
     * Imposta il valore della proprietà height.
     * 
     */
    public void setHeight(double value) {
        this.height = value;
    }

    /**
     * Recupera il valore della proprietà bmi.
     * 
     */
    public double getBmi() {
        return bmi;
    }

    /**
     * Imposta il valore della proprietà bmi.
     * 
     */
    public void setBmi(double value) {
        this.bmi = value;
    }

}
