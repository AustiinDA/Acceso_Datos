import java.util.HashMap;

public class PruebaHashMap {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<String, String>();

        diccionario.put("Hola", "Hello en Español");
        diccionario.put("Goodbye", "Adiós en inglés ");
        diccionario.put("Programación", "Programming en Español");

        for (String entrada : diccionario.keySet()){
            System.out.println("Entrada: " + entrada + " Definición: " + diccionario.get(entrada) +"\n");
        }
    }
}
