package desafio42_Enum;

import java.util.Scanner;

public class desafio42_Enum {

	public static void main(String[] args) {

		Scanner data = new Scanner(System.in);

		int[] socio = { 1011, 2367, 8748, 9121, 817, 6423, 2034 };
		String[] names = { "Enrique", "Liliana", "Lucas", "Juan", "Fiorella", "Ariel", "Daiana" };
		int ingresado;

		System.out.println("Ingrese un numero de socio: ");
		ingresado = data.nextInt();

		for (int i = 0; i < 7; i++) {

			if (ingresado == socio[i]) {

				System.out.println("El numero de socio corresponde a: " + names[i]);
				break;

			}
		}
	}
}
