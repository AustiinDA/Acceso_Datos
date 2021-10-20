import java.io.File;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ficheros_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce la ruta: ");
        String ruta = s.nextLine();
        System.out.println(ruta);
        File f = new File(ruta);


        if (f.exists() && f.isDirectory()){
            System.out.println("Contenido: ");
            String [] lista = f.list();
            for (String t: lista) {
                if (t.endsWith(".txt")) System.out.println(t);
            }
        }else {
            System.out.println("ERROR");
        }


    }

}
