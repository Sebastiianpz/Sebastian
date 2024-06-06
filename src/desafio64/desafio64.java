package desafio64;

import java.util.Scanner;

public class desafio64 {

	public static void main(String[] args) {

		Scanner data = new Scanner(System.in);

		String apellido;
		String nombre;
		String apellidomin;
		String nombremin;
		
		System.out.println("Ingrese su nombre: ");
		nombre = data.next().toLowerCase();

		System.out.println("Ingrese su apellido: ");
		apellido = data.next().toLowerCase();
		
		char primer_nombre = nombre.toUpperCase().charAt(0);
		char primer_apellido = apellido.toUpperCase().charAt(0);
		
		String nombresinprincipio = nombre.substring(1);
		String apellidosinprincipio = apellido.substring(1);
		
		System.out.println("El nombre pulido es: " + primer_nombre + nombresinprincipio);
		System.out.println("El apellido pulido es: " + primer_apellido + apellidosinprincipio);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
