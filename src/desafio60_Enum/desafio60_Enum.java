package desafio60_Enum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class desafio60_Enum {

	public static void main(String[] args) {

		Scanner data = new Scanner(System.in);
		boolean entero = true;

		while (entero) {

			try {

				System.out.println("Ingresa un numero entero: ");
				int numero = data.nextInt();

				entero = false;

				System.out.println("Numero ingresado: " + numero);

			} catch (InputMismatchException e) {

				System.out.println("Dato no valido.");
				data.next();
			}
		}
	}
}
