package Pruebas;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import java.io.File;
import java.io.IOException;

public class LeerAlumnosXML_v2 {
    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        Document docXML = null;

        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            docXML = builder.parse(new File("alumnos.xml"));

            docXML.getDocumentElement().normalize();
            System.out.println("Ya está parseando");

            NodeList nombres = docXML.getElementsByTagName("nombre");
            NodeList edades = docXML.getElementsByTagName("edad");
            String nombre = nombres.item(0).getTextContent();
            System.out.println(nombre);

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
