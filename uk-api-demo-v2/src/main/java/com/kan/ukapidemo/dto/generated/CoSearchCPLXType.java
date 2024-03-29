
package com.kan.ukapidemo.dto.generated;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Company Search result Cplx type
 * 
 * <p>Java class for CoSearchCPLXType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoSearchCPLXType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}CompanyName"/&gt;
 *         &lt;element ref="{}CompanyNumber"/&gt;
 *         &lt;element ref="{}DataSet"/&gt;
 *         &lt;element ref="{}CompanyIndexStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{}CompanyDate" minOccurs="0"/&gt;
 *         &lt;element ref="{}SearchMatch" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoSearchCPLXType", propOrder = {
    "companyName",
    "companyNumber",
    "dataSet",
    "companyIndexStatus",
    "companyDate",
    "searchMatch"
})
public class CoSearchCPLXType {

    @XmlElement(name = "CompanyName", required = true)
    protected String companyName;
    @XmlElement(name = "CompanyNumber", required = true)
    protected String companyNumber;
    @XmlElement(name = "DataSet", required = true)
    protected String dataSet;
    @XmlElement(name = "CompanyIndexStatus")
    protected String companyIndexStatus;
    @XmlElement(name = "CompanyDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar companyDate;
    @XmlElement(name = "SearchMatch")
    protected String searchMatch;

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the companyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyNumber() {
        return companyNumber;
    }

    /**
     * Sets the value of the companyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyNumber(String value) {
        this.companyNumber = value;
    }

    /**
     * Gets the value of the dataSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSet() {
        return dataSet;
    }

    /**
     * Sets the value of the dataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSet(String value) {
        this.dataSet = value;
    }

    /**
     * Gets the value of the companyIndexStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyIndexStatus() {
        return companyIndexStatus;
    }

    /**
     * Sets the value of the companyIndexStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyIndexStatus(String value) {
        this.companyIndexStatus = value;
    }

    /**
     * Gets the value of the companyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompanyDate() {
        return companyDate;
    }

    /**
     * Sets the value of the companyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompanyDate(XMLGregorianCalendar value) {
        this.companyDate = value;
    }

    /**
     * Gets the value of the searchMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchMatch() {
        return searchMatch;
    }

    /**
     * Sets the value of the searchMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchMatch(String value) {
        this.searchMatch = value;
    }

}
