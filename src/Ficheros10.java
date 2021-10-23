import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Ficheros10 {
    public static void main(String[] args) {

        HashMap<String, Integer> asciiAlmacen = new HashMap<String, Integer>();

        try (FileReader fr = new FileReader("C:\\Users\\Alumno_FP\\IdeaProjects\\Acceso a Datos\\caracteres.txt"); BufferedReader br = new BufferedReader(fr)) {
            int i = 0;
            String lineas = "", texto = "";
            while ((i = br.read()) != -1) {
                System.out.print((char) i);
                asciiAlmacen.put(null, null);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Alumno_FP\\IdeaProjects\\Acceso a Datos\\caracteres.txt")))
//    String lineaActual;
