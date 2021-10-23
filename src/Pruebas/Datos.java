package Pruebas;

import java.io.Serializable;

public class Datos implements Serializable{
	String primero = "1 de enero 2021";
	int[] horas = new int[24];
	double[] temperaturas = new double[24];

	
	public Datos() {
		generarHoras(horas);
		generarTemp(temperaturas);
	}
	
	public void generarHoras(int[] horas) {
		for (int i = 0; i < horas.length; i++) {
			horas[i] = i;
		}
	}

	public void generarTemp(double[] tempera) {
		for (int i = 0; i < tempera.length; i++) {
			tempera[i] = Math.floor((Math.random()*100)*100)/100;
		}
	}
	
	public void imprimirTodo(int[] horas, double[] tempera) {
		for (int i = 0; i < tempera.length; i++) {
			
			System.out.printf("Hora: %02dh >> Temperatura: %.2f�C\n", horas[i], tempera[i]);
		}
	}
	public String getPrimero() {
		return primero;
	}

	public int[] getHoras() {
		return horas;
	}

	public double[] getTemperaturas() {
		return temperaturas;
	}

}
