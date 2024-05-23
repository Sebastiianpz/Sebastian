package desafio24;

import java.util.Scanner;

public class desafio24 {

	public static void main(String[] args) {

		Scanner data = new Scanner(System.in);

		boolean salir = false;
		int n1, n2, suma;
		int s0;

		do {

			System.out.println("Ingrese un numero: ");
			n1 = data.nextInt();
			System.out.println("Ingrese otro numero: ");
			n2 = data.nextInt();

			suma = n1 + n2;

			System.out.println("La suma de ambos numeros es: " + suma);

			System.out.println("Oprima 0 si desea salir, si no, cualquier otra numero");
			s0 = data.nextInt();

			if (s0 == 0) {

				salir = true;
				System.out.println("Has salido del programa.");
			}

		} while (salir == false);

	}
}
