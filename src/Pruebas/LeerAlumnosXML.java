package Pruebas;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class LeerAlumnosXML {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        Document docXML = null;

        dbf.setIgnoringElementContentWhitespace(true);
        dbf.setIgnoringComments(true);

        DocumentBuilder db = dbf.newDocumentBuilder();
        File archivo = new File("alumnos.xml");

        docXML = db.parse(archivo);
        System.out.println("Completada la transferencia de datos. Finalizando conexion...");

        //Accedemos al primer nodo raiz
        Node nodoRaiz = docXML.getFirstChild();
        System.out.println(nodoRaiz.getNodeName());

    }
}