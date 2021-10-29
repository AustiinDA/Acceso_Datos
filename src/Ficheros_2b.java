import java.io.File;
import java.util.Scanner;

public class Ficheros_2b {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la ruta: ");

        //Petición de entrada por consola de la ruta
        String ruta = s.nextLine();
        File f = new File(ruta);

        //Comprobacion si el fichero existe y es directorio
        if (f.exists() && f.isDirectory()) {
            System.out.println("Contenido del directorio: ");
            System.out.println("================ " + f.getName() + " =================");
            //Rellenamos el array de archivos con nuestros archivos en la ruta
            File[] listaArchivos = f.listFiles();
            for (File archivo : listaArchivos) {
                if (archivo.isFile()) System.out.println(archivo.getName());
            }
            System.out.println("======================================================");
        } else {
            System.out.println("ERROR, el archivo no existe o no es un directorio");
        }


    }
}
