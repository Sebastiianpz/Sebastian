package desafio54_Enum;

import java.util.Scanner;

public class desafio54_Enum {

	static Scanner data = new Scanner(System.in);

	static int[] socio = { 1011, 2367, 8748, 9121, 817, 6423, 2034 };
	static String[] names = { "Enrique", "Liliana", "Lucas", "Juan", "Fiorella", "Ariel", "Daiana" };
	static int ingresado;

	public static void ingresoDeDatos() {

		System.out.println("Ingrese un numero de socio: ");
		ingresado = data.nextInt();
	}

	public static void busquedaSocio() {

		for (int i = 0; i < 7; i++) {

			if (ingresado == socio[i]) {

				System.out.println("El numero de socio corresponde a: " + names[i]);
				break;
			}
		}
	}

	public static void main(String[] args) {
		
		ingresoDeDatos();
		busquedaSocio();
	}
}
