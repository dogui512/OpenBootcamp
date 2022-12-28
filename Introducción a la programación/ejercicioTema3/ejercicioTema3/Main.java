package ejercicioTema3;

import ejercicioTema3.Coche;

public class Main {
	
	public static void main(String[] args) {
		//Parte 1
		sumarValores(12, 4, 8);
		
		//Parte 2
		Coche miCoche = new Coche();
		System.out.println("Incrementa en 1 el número de puertas. Total " + miCoche.incrementar(3) + " puertas");
	}
	
	public static void sumarValores(int valor1, int valor2, int valor3) {
		int intResultado = valor1 + valor2 + valor3;
		System.out.println("El resultado de la suma es: " + intResultado);
	}
}
