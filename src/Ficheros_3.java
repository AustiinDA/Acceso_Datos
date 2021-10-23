import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ficheros_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce la ruta del archivo: ");
        String ruta = s.nextLine();
        System.out.println(ruta);
        File f = new File(ruta);

        try (FileReader fr = new FileReader(f)) {
            int i;
            while ((i=fr.read())!=-1) System.out.print((char) i);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
