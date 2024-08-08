package desafio58_Enum;

import java.util.Scanner;

public class desafio58_Enum {

	static Scanner data = new Scanner (System.in);
	
	static String nombre, apellido;
	
	public static void ingresoNombre() {
		
		System.out.println("Ingrese su nombre: ");
		nombre = data.next().toLowerCase();
	}
	
	public static void ingresoApellido() {
		
		System.out.println("Ingrese su apellido: ");
		apellido = data.next().toLowerCase();
	}
	
	public static void mostrarDatos() {
		
		char primer_nombre = nombre.toUpperCase().charAt(0);
		char primer_apellido = apellido.toUpperCase().charAt(0);
		
		String nombresinprincipio = nombre.substring(1);
		String apellidosinprincipio = apellido.substring(1);

		System.out.println("El nombre pulido es: " + primer_nombre + nombresinprincipio);
		System.out.println("El apellido pulido es: " + primer_apellido + apellidosinprincipio);
	}
	
	public static void main(String[] args) {
		
		ingresoNombre();
		ingresoApellido();
		mostrarDatos();
	}
}
