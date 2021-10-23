import java.io.*;

public class Ficheros13_Escritor {

    public static void main(String[] args) {
        //Datos dat1 = null;

        File archivo = new File("Discos.dat");

        Ficheros13 d1 = new Ficheros13("Sticky Fingers", "The Rolling Stones");

        try (FileOutputStream fos = new FileOutputStream(archivo); ObjectOutputStream oos = new ObjectOutputStream(fos)){

            oos.writeObject(d1);
            System.out.println("Exito en escritura de " + d1);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
