import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Ficheros10 {
    public static void main(String[] args) {

        long tiempo = System.currentTimeMillis();

        HashMap<Character, Integer> almacenAscii = new HashMap<Character, Integer>();
        ArrayList<String> textos = new ArrayList<>();

        try (FileReader fr = new FileReader("caracteres.txt"); BufferedReader br = new BufferedReader(fr)) {
            int contarChar = 0;
            char caracterAscii;
            String lineas = "";

            while ((lineas = br.readLine()) != null) {
                textos.add(lineas);
            }

            for (String linea : textos) {
                for (int i = 0; i < linea.length(); i++) {
                    caracterAscii = linea.charAt(i);

                    if (almacenAscii.containsKey(caracterAscii)) {
                        contarChar = almacenAscii.get(caracterAscii) + 1;
                        almacenAscii.put(caracterAscii, contarChar);
                    } else {
                        almacenAscii.put(caracterAscii, 1);
                    }
                }
            }

            for (Character letraAscii : almacenAscii.keySet()) {
                int repeticiones = almacenAscii.get(letraAscii);
                System.out.println(letraAscii + " > aparacece en el texto " + repeticiones + " veces");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        long tiempo_fin = System.currentTimeMillis();

        System.out.println(tiempo_fin - tiempo +"ms");
    }
}

