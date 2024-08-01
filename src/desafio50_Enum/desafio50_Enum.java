package desafio50_Enum;

import java.util.Scanner;

public class desafio50_Enum {

	static Scanner data = new Scanner(System.in);
	static String nombre;

	public static void IngresarDatos() {

		System.out.println("Ingrese su nombre: ");
		nombre = data.next();
	}

	public static void MostrarDatos() {

		System.out.println("Su nombre es: " + nombre + "\n");
	}

	public static void main(String[] args) {
		
		IngresarDatos();
		MostrarDatos();
		
		IngresarDatos();
		MostrarDatos();
		
		IngresarDatos();
		MostrarDatos();
	}
}
