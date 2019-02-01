//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.25 at 04:30:29 PM CET 
//


package asd;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tDefinitions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tDefinitions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/DMN/20180521/MODEL/}tNamedElement">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.omg.org/spec/DMN/20180521/MODEL/}import" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="itemDefinition" type="{http://www.omg.org/spec/DMN/20180521/MODEL/}tItemDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/DMN/20180521/MODEL/}drgElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/DMN/20180521/MODEL/}artifact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="elementCollection" type="{http://www.omg.org/spec/DMN/20180521/MODEL/}tElementCollection" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/DMN/20180521/MODEL/}businessContextElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/DMN/20180521/DMNDI/}DMNDI" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="expressionLanguage" type="{http://www.w3.org/2001/XMLSchema}anyURI" default="http://www.omg.org/spec/DMN/20180521/FEEL/" />
 *       &lt;attribute name="typeLanguage" type="{http://www.w3.org/2001/XMLSchema}anyURI" default="http://www.omg.org/spec/DMN/20180521/FEEL/" />
 *       &lt;attribute name="namespace" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="exporter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="exporterVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(namespace = "http://www.omg.org/spec/DMN/20180521/MODEL/", name = "definitions")
@XmlType(namespace = "http://www.omg.org/spec/DMN/20180521/MODEL/", name = "tDefinitions", propOrder = {
    "_import",
    "itemDefinition",
    "drgElement",
    "artifact",
    "elementCollection",
    "businessContextElement",
    "dmndi"
})
@XmlSeeAlso({
    TDRGElement.class
})
public class TDefinitions
    extends TNamedElement
{

    @XmlElement(name = "import")
    protected List<TImport> _import;
    protected List<TItemDefinition> itemDefinition;
    @XmlElements(value = {
        @XmlElement(name = "inputData", namespace = "http://www.omg.org/spec/DMN/20180521/MODEL/", type = TInputData.class, required = false),
        @XmlElement(name = "decision", namespace = "http://www.omg.org/spec/DMN/20180521/MODEL/", type = TDecision.class, required = false)
    }
    )
    protected List<TDRGElement> drgElement;
    @XmlElement(name = "artifact", namespace = "http://www.omg.org/spec/DMN/20180521/MODEL/", type = TArtifact.class, required = false)
    protected List<TArtifact> artifact;
    protected List<TElementCollection> elementCollection;
    @XmlElement(name = "businessContextElement", namespace = "http://www.omg.org/spec/DMN/20180521/MODEL/", type = TBusinessContextElement.class, required = false)
    protected List<TBusinessContextElement> businessContextElement;
    @XmlElement(name = "DMNDI", namespace = "http://www.omg.org/spec/DMN/20180521/DMNDI/")
    protected DMNDI dmndi;
    @XmlAttribute(name = "expressionLanguage")
    @XmlSchemaType(name = "anyURI")
    protected String expressionLanguage;
    @XmlAttribute(name = "typeLanguage")
    @XmlSchemaType(name = "anyURI")
    protected String typeLanguage;
    @XmlAttribute(name = "namespace", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String namespace;
    @XmlAttribute(name = "exporter")
    protected String exporter;
    @XmlAttribute(name = "exporterVersion")
    protected String exporterVersion;

    /**
     * Gets the value of the import property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the import property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TImport }
     * 
     * 
     */
    public List<TImport> getImport() {
        if (_import == null) {
            _import = new ArrayList<TImport>();
        }
        return this._import;
    }

    /**
     * Gets the value of the itemDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TItemDefinition }
     * 
     * 
     */
    public List<TItemDefinition> getItemDefinition() {
        if (itemDefinition == null) {
            itemDefinition = new ArrayList<TItemDefinition>();
        }
        return this.itemDefinition;
    }

    /**
     * Gets the value of the drgElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drgElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrgElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TInputData }{@code >}
     * {@link JAXBElement }{@code <}{@link TDecisionService }{@code >}
     * {@link JAXBElement }{@code <}{@link TDecision }{@code >}
     * {@link JAXBElement }{@code <}{@link TKnowledgeSource }{@code >}
     * {@link JAXBElement }{@code <}{@link TInvocable }{@code >}
     * {@link JAXBElement }{@code <}{@link TDRGElement }{@code >}
     * {@link JAXBElement }{@code <}{@link TBusinessKnowledgeModel }{@code >}
     * 
     * 
     */
    public List<TDRGElement> getDrgElement() {
        if (drgElement == null) {
            drgElement = new ArrayList<TDRGElement>();
        }
        return this.drgElement;
    }

    /**
     * Gets the value of the artifact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artifact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtifact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TTextAnnotation }{@code >}
     * {@link JAXBElement }{@code <}{@link TArtifact }{@code >}
     * {@link JAXBElement }{@code <}{@link TAssociation }{@code >}
     * 
     * 
     */
    public List<TArtifact> getArtifact() {
        if (artifact == null) {
            artifact = new ArrayList<TArtifact>();
        }
        return this.artifact;
    }

    /**
     * Gets the value of the elementCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elementCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElementCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TElementCollection }
     * 
     * 
     */
    public List<TElementCollection> getElementCollection() {
        if (elementCollection == null) {
            elementCollection = new ArrayList<TElementCollection>();
        }
        return this.elementCollection;
    }

    /**
     * Gets the value of the businessContextElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessContextElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessContextElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TPerformanceIndicator }{@code >}
     * {@link JAXBElement }{@code <}{@link TBusinessContextElement }{@code >}
     * {@link JAXBElement }{@code <}{@link TOrganizationUnit }{@code >}
     * 
     * 
     */
    public List<TBusinessContextElement> getBusinessContextElement() {
        if (businessContextElement == null) {
            businessContextElement = new ArrayList<TBusinessContextElement>();
        }
        return this.businessContextElement;
    }

    /**
     * Gets the value of the dmndi property.
     * 
     * @return
     *     possible object is
     *     {@link DMNDI }
     *     
     */
    public DMNDI getDMNDI() {
        return dmndi;
    }

    /**
     * Sets the value of the dmndi property.
     * 
     * @param value
     *     allowed object is
     *     {@link DMNDI }
     *     
     */
    public void setDMNDI(DMNDI value) {
        this.dmndi = value;
    }

    /**
     * Gets the value of the expressionLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpressionLanguage() {
        if (expressionLanguage == null) {
            return "http://www.omg.org/spec/DMN/20180521/FEEL/";
        } else {
            return expressionLanguage;
        }
    }

    /**
     * Sets the value of the expressionLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpressionLanguage(String value) {
        this.expressionLanguage = value;
    }

    /**
     * Gets the value of the typeLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeLanguage() {
        if (typeLanguage == null) {
            return "http://www.omg.org/spec/DMN/20180521/FEEL/";
        } else {
            return typeLanguage;
        }
    }

    /**
     * Sets the value of the typeLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeLanguage(String value) {
        this.typeLanguage = value;
    }

    /**
     * Gets the value of the namespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Sets the value of the namespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespace(String value) {
        this.namespace = value;
    }

    /**
     * Gets the value of the exporter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExporter() {
        return exporter;
    }

    /**
     * Sets the value of the exporter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExporter(String value) {
        this.exporter = value;
    }

    /**
     * Gets the value of the exporterVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExporterVersion() {
        return exporterVersion;
    }

    /**
     * Sets the value of the exporterVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExporterVersion(String value) {
        this.exporterVersion = value;
    }

}
