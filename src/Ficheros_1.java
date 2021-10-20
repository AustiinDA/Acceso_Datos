import java.io.File;

public class Ficheros_1 {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\Alumno_FP\\IdeaProjects\\Acceso a Datos\\fichero1.txt");
        File f2 = new File("C:\\Users\\Alumno_FP\\IdeaProjects\\Acceso a Datos\\fichero2.txt");
        File d1 = new File("C:\\Users\\Alumno_FP\\IdeaProjects\\Acceso a Datos\\Directorio Inexistente");
        File d2 = new File("C:\\Users\\Alumno_FP\\IdeaProjects\\Acceso a Datos\\Directorio Real");
        //Comprobando los ficheros con el metodo
        comprobarFichero(f1);
        comprobarFichero(f2);
        comprobarFichero(d1);
        comprobarFichero(d2);

    }

    //Metodo de comprobacion
    public static void comprobarFichero(File f) {
        if (f.exists()) {
            System.out.println(f + " El fichero/directorio existe");
        } else {
            System.out.println(f + " El fichero/directorio no existe");
        }
        if (f.isFile()) {
            System.out.println(f + " Es un archivo");
        } else {
            System.out.println(f + " No es un archivo");
        }

    }

}
