import java.io.*;
import java.util.Scanner;

public class Ficheros4 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        File frases = new File("\\Acceso a Datos\\Frases.txt");
        frases.createNewFile();

        try (FileReader fr = new FileReader(frases); FileWriter fw = new FileWriter(frases)){
            String frases_texto = "";

            while (!frases_texto.equals("fin")) {

                System.out.println("Escribe una frase: ");
                frases_texto = s.nextLine();
                if (s.nextLine() == "fin") System.out.println("Saliendo...");


            }

            fw.write(frases_texto);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
