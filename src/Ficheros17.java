import javax.swing.*;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ficheros17 {
    public static void main(String[] args) throws FileNotFoundException {
        String entrada = "";
        Scanner s = new Scanner(System.in);
        long pos = 0;

        File f = new File("C:\\Users\\Alumno_FP\\IdeaProjects\\Acceso a Datos\\ficheros\\prueba_aleatorio.txt");
        if (f.exists()) f.delete();

        RandomAccessFile fichero = new RandomAccessFile(f, "rw");
        try {
            do {
                System.out.println("Mete ahi");
                entrada = s.next();
                fichero.writeInt(Integer.parseInt(entrada));

            } while ((entrada.matches("[0-9]+$")));

        } catch (NumberFormatException e) {
            System.out.println("Entrada terminada");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //cosas rarars

        try {
            fichero.seek(pos);
            //Esto lee los bytes
            for (int i = 0; i < fichero.length() / 4; i++) {
                System.out.print(fichero.readInt() + " | ");
            }
            //Leer con el escaner posicion deseada
            System.out.println("\n¿Qué posición quiere leer?");
            pos = (s.nextInt() - 1);
            fichero.seek(pos * 4);

            System.out.println("En la posicion número " + (pos + 1) + " se encuentra el valor númerico: "+ fichero.readInt());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

