import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ficheros11 {
    public static void main(String[] args) throws IOException {
        //Crear carpeta y verificarla

        String fecha =  new SimpleDateFormat(" "+ "yyyy-MM-dd" +" HH.mm.ss").format(new Date());
        File directorioData = new File("C:\\Users\\Alumno_FP\\IdeaProjects\\Acceso a Datos\\carpetaData");
        File directorioBack = new File("C:\\Users\\Alumno_FP\\IdeaProjects\\Acceso a Datos\\carpetaData\\dataBackup" + fecha) ;

        if (!directorioBack.exists()) {
            if (directorioBack.mkdir()) {
                System.out.println("Directorio " + directorioBack + " creado.");
            } else {
                System.out.println("Carpeta no creada");
            }
        }
        //Comprobar los archivitos
        for (File archivos : directorioData.listFiles()) {
            if (archivos.isFile()) {
                //Guardar los archivitos
                try (FileInputStream fis = new FileInputStream(archivos); FileOutputStream fos = new FileOutputStream(directorioBack.getPath() +"\\" + archivos.getName())) {
                    byte[] arrayArchivos = fis.readAllBytes();
                    fos.write(arrayArchivos);
                    System.out.println("Contenido carpeta: "+ archivos.getName()) ;
                    fis.close();
                    fos.close();
                } catch (FileNotFoundException e) {
                    System.out.println("Archivos no encontrados");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
