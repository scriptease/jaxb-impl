
package com.sun.xml.bind.v2.schemagen.xmlschema;

import javax.xml.namespace.QName;
import com.sun.xml.txw2.TypedXmlWriter;
import com.sun.xml.txw2.annotation.XmlAttribute;
import com.sun.xml.txw2.annotation.XmlElement;

@XmlElement("restriction")
public interface ComplexRestriction
    extends Annotated, AttrDecls, TypeDefParticle, TypedXmlWriter
{


    @XmlAttribute
    public ComplexRestriction base(QName value);

}
