package desafio61;

import java.util.Scanner;

public class desafio61 {

	public static void main(String[] args) {

		Scanner data = new Scanner(System.in);

		String apellido;
		String nombre;

		System.out.println("Ingrese su nombre: ");
		nombre = data.next();

		System.out.println("Ingrese su apellido: ");
		apellido = data.next();

		System.out.println("\n");
		
		System.out.println(nombre.toLowerCase() + ". Longitud del nombre: " + nombre.length());
		System.out.println(apellido.toUpperCase() + ". longitud del apellido:" + apellido.length());
		
		
	}

}
