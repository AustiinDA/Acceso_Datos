package Pruebas;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Ejercicio_12_8 implements Serializable{

	public static void main(String[] args) {
		Datos dat1 = null;
		
		try (FileInputStream fis = new FileInputStream("Temperas.dat"); ObjectInputStream ois = new ObjectInputStream(fis)){
			dat1 = (Datos)ois.readObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		dat1.imprimirTodo(dat1.getHoras(), dat1.getTemperaturas());
		
	}
	
	
	
}
