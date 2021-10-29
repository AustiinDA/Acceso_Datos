import java.io.*;
import java.util.Scanner;

public class Ficheros7 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        String frases_texto = "";


        File arhivo_frases = new File("Frases_buffer.txt");
        arhivo_frases.createNewFile();

        try (FileWriter fw = new FileWriter(arhivo_frases)) {

            while (!frases_texto.equals("fin")) {
                System.out.println("Escribe una frase, escribe 'fin' para finalizar: ");
                fw.write(frases_texto + " ");
                frases_texto = s.nextLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader(arhivo_frases); BufferedReader br = new BufferedReader(fr)) {
            String texto_leido = "";

            while (texto_leido != null) {
                System.out.println(texto_leido);
                texto_leido = br.readLine();
            }
        }
    }
}


