package Pruebas;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
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
        NodeList nodoHijos = nodoRaiz.getChildNodes();
        Node nodoHijo = null;
        nodoRaiz = limpiarNodos(nodoRaiz);
        for (int i = 0; i < nodoHijos.getLength(); i++) {
            nodoHijo = nodoHijos.item(i);
            nodoHijo = limpiarNodos(nodoHijo);
            System.out.println(nodoHijos.item(i).getNodeName());
            NodeList nodoNietos = nodoHijos.item(i).getChildNodes();
            for (int j = 0; j < nodoNietos.getLength(); j++) {
                System.out.println(nodoNietos.item(j).getNodeName() + ": " + nodoNietos.item(j).getTextContent());
                //atrHijo = nodoHijo.getAttributes();
              //  for (int k = 0; k < atr ; k++) {

               // }
            }
        }
    }

    static public Node limpiarNodos(Node nodeAux) {
        if (nodeAux.hasChildNodes()) {
            NodeList listaHijos = nodeAux.getChildNodes();
            Node aux = null;

            for (int i = 0; i < listaHijos.getLength(); i++) {
                aux = listaHijos.item(i);
                if (aux.getNodeType() == 3) {
                    aux.setTextContent(aux.getTextContent().trim());
                    if (aux.getTextContent().equals(""))
                        aux.getParentNode().removeChild(aux);
                }
            }
        }
        return nodeAux;
    }
}