package desafio27;

import java.util.Scanner;

public class desafio27 {

	public static void main(String[] args) {

		Scanner data = new Scanner(System.in);

		int contra = 2008, intentosrestantes = 2, contraingresada;
		boolean llevadas = true;
		
		
		System.out.println("///Info: cumpleaños del programador en cuestion///\n");

		do {

			System.out.println("Ingrese la contraseña: ");
			contraingresada = data.nextInt();
			if (contra == contraingresada) {
				llevadas = false;
				System.out.println("\nIngresaste al sistema.");
			} else {

				System.out.println("\nIntentos restantes: " + intentosrestantes);
				intentosrestantes--;
			}

		} while (llevadas == true && intentosrestantes <= 0);

		if (intentosrestantes <= 0) {

			System.err.println("Bloqueado.");

		}

	}
}
