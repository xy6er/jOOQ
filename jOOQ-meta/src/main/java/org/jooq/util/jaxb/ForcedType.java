







package org.jooq.util.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jooq.util.jaxb.tools.StringAdapter;


/**
 * <p>Java class for ForcedType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ForcedType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="converter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="enumConverter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="binding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expressions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="types" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForcedType", propOrder = {

})
@SuppressWarnings({
    "all"
})
public class ForcedType implements Serializable
{

    private final static long serialVersionUID = 31000L;
    @XmlJavaTypeAdapter(StringAdapter.class)
    protected String name;
    @XmlJavaTypeAdapter(StringAdapter.class)
    protected String userType;
    @XmlJavaTypeAdapter(StringAdapter.class)
    protected String converter;
    protected Boolean enumConverter;
    @XmlJavaTypeAdapter(StringAdapter.class)
    protected String binding;
    @XmlJavaTypeAdapter(StringAdapter.class)
    protected String expression;
    @XmlJavaTypeAdapter(StringAdapter.class)
    protected String expressions;
    @XmlJavaTypeAdapter(StringAdapter.class)
    protected String types;

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the userType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUserType(String value) {
        this.userType = value;
    }

    /**
     * Gets the value of the converter property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getConverter() {
        return converter;
    }

    /**
     * Sets the value of the converter property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setConverter(String value) {
        this.converter = value;
    }

    /**
     * Gets the value of the enumConverter property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isEnumConverter() {
        return enumConverter;
    }

    /**
     * Sets the value of the enumConverter property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setEnumConverter(Boolean value) {
        this.enumConverter = value;
    }

    /**
     * Gets the value of the binding property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBinding() {
        return binding;
    }

    /**
     * Sets the value of the binding property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBinding(String value) {
        this.binding = value;
    }

    /**
     * Gets the value of the expression property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExpression() {
        return expression;
    }

    /**
     * Sets the value of the expression property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExpression(String value) {
        this.expression = value;
    }

    /**
     * Gets the value of the expressions property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExpressions() {
        return expressions;
    }

    /**
     * Sets the value of the expressions property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExpressions(String value) {
        this.expressions = value;
    }

    /**
     * Gets the value of the types property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTypes() {
        return types;
    }

    /**
     * Sets the value of the types property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTypes(String value) {
        this.types = value;
    }

    public ForcedType withName(String value) {
        setName(value);
        return this;
    }

    public ForcedType withUserType(String value) {
        setUserType(value);
        return this;
    }

    public ForcedType withConverter(String value) {
        setConverter(value);
        return this;
    }

    public ForcedType withEnumConverter(Boolean value) {
        setEnumConverter(value);
        return this;
    }

    public ForcedType withBinding(String value) {
        setBinding(value);
        return this;
    }

    public ForcedType withExpression(String value) {
        setExpression(value);
        return this;
    }

    public ForcedType withExpressions(String value) {
        setExpressions(value);
        return this;
    }

    public ForcedType withTypes(String value) {
        setTypes(value);
        return this;
    }

}
