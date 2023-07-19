package com.kan.ukapidemo.service.impl;

import com.kan.ukapidemo.service.MarshalService;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.stereotype.Service;
import org.w3c.dom.Node;

import javax.xml.namespace.NamespaceContext;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Iterator;

@Service
public class MarshalServiceImpl implements MarshalService {
  @Override
  public String marshal(Object object, Class clazz) {
    JAXBContext context = null;

    try {
      StringWriter stringWriter = new StringWriter();

      context = JAXBContext.newInstance(clazz);
      Marshaller marshaller = context.createMarshaller();
      marshaller.marshal(object, stringWriter);

      return stringWriter.toString();

    } catch (JAXBException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public Object unmarshal(String xmlString, Class clazz) {
    JAXBContext context = null;
    try {
      StringReader stringReader = new StringReader(xmlString);
      context = JAXBContext.newInstance(clazz);
      Unmarshaller unmarshaller = context.createUnmarshaller();
      return unmarshaller.unmarshal(stringReader);
    } catch (JAXBException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public Object unmarshal(Node xmlNode, Class clazz) {
    JAXBContext context = null;
    try {
      context = JAXBContext.newInstance(clazz);
      Unmarshaller unmarshaller = context.createUnmarshaller();
      return unmarshaller.unmarshal(xmlNode);
    } catch (JAXBException e) {
      throw new RuntimeException(e);
    }
  }

  private void setNamespaceContxt(XMLStreamWriter xmlStreamWriter) throws XMLStreamException {
    xmlStreamWriter.setNamespaceContext(new NamespaceContext() {
      @Override
      public String getNamespaceURI(String prefix) {
        return "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader";
      }

      @Override
      public String getPrefix(String namespaceURI) {
        return "";
      }

      @Override
      public Iterator<String> getPrefixes(String namespaceURI) {
        return null;
      }
    });
  }


}
