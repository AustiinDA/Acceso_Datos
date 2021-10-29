import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Ficheros_3b {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el nombre del archivo y su extension: ");

        String ruta = s.nextLine();
        File f = new File(ruta);

        try(FileReader fr = new FileReader(f)) {
            int i;
            while ((i = fr.read()) != -1) System.out.print((char) i);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
