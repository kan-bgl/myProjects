
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisterTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RegisterTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DIRECTORSURA"/&gt;
 *     &lt;enumeration value="DIRECTORS"/&gt;
 *     &lt;enumeration value="SECRETARIES"/&gt;
 *     &lt;enumeration value="MEMBERS"/&gt;
 *     &lt;enumeration value="LLPMEMBERS"/&gt;
 *     &lt;enumeration value="LLPMEMBERSURA"/&gt;
 *     &lt;enumeration value="PSC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RegisterTypeType")
@XmlEnum
public enum RegisterTypeType {

    DIRECTORSURA,
    DIRECTORS,
    SECRETARIES,
    MEMBERS,
    LLPMEMBERS,
    LLPMEMBERSURA,
    PSC;

    public String value() {
        return name();
    }

    public static RegisterTypeType fromValue(String v) {
        return valueOf(v);
    }

}
