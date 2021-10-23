import java.io.File;
import java.io.IOException;

public class CrearFichero {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\Alumno_FP\\IdeaProjects\\Acceso a Datos\\PedroElDeLosPalotes.txt"); //RUTA

        try {
            if (f1.createNewFile())
                System.out.println("Creado");
            else
                System.out.println("El fichero ya existe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
