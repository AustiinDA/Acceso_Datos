import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Ficheros10 {
    public static void main(String[] args) {

        HashMap<String, Integer> asciiAlmacen = new HashMap<String, Integer>();
        File f = new File("caracteres.txt");

        try (FileReader fr = new FileReader("caracteres.txt"); BufferedReader br = new BufferedReader(fr)) {
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

