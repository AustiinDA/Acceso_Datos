import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ficheros13_Lector {

    public static void main(String[] args) throws ClassNotFoundException {

        Ficheros13 datos = null;
        try (FileInputStream fis = new FileInputStream("Discos.dat"); ObjectInputStream ois = new ObjectInputStream(fis)){

            datos = (Ficheros13) ois.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(datos);
    }





}
