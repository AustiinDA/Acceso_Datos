import java.io.File;
import java.util.Scanner;

public class Ficheros_2b {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce la ruta: ");

        String ruta = s.nextLine();
        System.out.println(ruta);
        File f = new File(ruta);


        if (f.exists() && f.isDirectory()) {
            System.out.println("Contenido: ");
            File[] lista = f.listFiles();
            for (File archivos : lista) {
                if (archivos.isFile()) System.out.println(archivos.getName());
            }
        } else {
            System.out.println("ERROR");
        }


    }
}
