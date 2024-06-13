package desafio43_Enum;

import java.util.Scanner;

public class desafio43_Enum {
	
	public static void main(String[] args) {

		Scanner data = new Scanner(System.in);

		int[] socio = { 1011, 2367, 8748, 9121, 817, 6423, 2034 };
		String[] names = { "Enrique", "Liliana", "Lucas", "Juan", "Fiorella", "Ariel", "Daiana" };
		int ingresado, divi = 0;

		System.out.println("Ingrese un numero de socio: ");
		ingresado = data.nextInt();

		for (int i = 0; i < 7; i++) {

			if (ingresado == socio[i] && socio[i] % 2 == 0) {

				System.out.println("Este numero de socio es par y no se debe mostrar.");
				break;
			}

			if (ingresado == socio[i]) {

				System.out.println("El numero de socio corresponde a: " + names[i]);
				break;
			}
		}

	}
}
