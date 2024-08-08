package desafio56_Enum;

import java.util.Scanner;

public class desafio56_Enum {

	static Scanner data = new Scanner(System.in);
	static String nombre, apellido;
	
	public static void ingresoNombre() {

		System.out.println("Ingrese su nombre: ");
		nombre = data.nextLine().toLowerCase();
	}

	public static void ingresoApellido() {
		
		System.out.println("Ingrese su apellido: ");
		apellido = data.nextLine().toUpperCase();
	}
	
	public static void mostrarDatos() {
		
		System.out.println("Su nombre y apellido es " + nombre + " " + apellido);
		System.out.println("La longitud del nombre es de " + nombre.length() + " caracteres y la longitud del apellido es de " + apellido.length() + " caracteres");
	}
	
	public static void main(String[] args) {
		ingresoNombre();
		ingresoApellido();
		mostrarDatos();
	}
}
