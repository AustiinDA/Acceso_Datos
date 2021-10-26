import java.io.*;
import java.util.Scanner;

public class Ficheros4 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        String frases_texto = "";

        File frases = new File("Frases.txt");
        frases.createNewFile();

        try (FileWriter fw = new FileWriter(frases)) {
            while (!frases_texto.equals("fin")) {
                System.out.println("Escribe una frase, escribe fin para finalizar:");
                fw.write(frases_texto + "");
                frases_texto = s.nextLine();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader(frases)) {
            int num_carac = fr.read();
            while (num_carac != -1) {
                System.out.print((char) num_carac);
                num_carac = fr.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
