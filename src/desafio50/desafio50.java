package desafio50;

import java.util.Scanner;

public class desafio50 {

	public static void main(String[] args) {

		Scanner data = new Scanner(System.in);

		int[] apuestainsegura = new int[4];
		int[] apuestasegura = new int[4];
		int temporal;

		for (int i = 0; i < apuestainsegura.length; i++) {

			System.out.println("Cuanto dinero desea apostar por el producto?");
			apuestainsegura[i] = data.nextInt();

			if (apuestainsegura[i] >= 500) {

				apuestasegura[i] = apuestainsegura[i];
			} else {
				i--;
				System.out.println("Valor incorrecto.");
				continue;

			}
		}

		for (int i = 0; i < apuestasegura.length - 1; i++) {

			for (int j = 0; j < apuestasegura.length - i - 1; j++) {

				if (apuestasegura[j] < apuestasegura[j + 1]) {

					temporal = apuestasegura[j];
					apuestasegura[j] = apuestasegura[j + 1];
					apuestasegura[j + 1] = temporal;

				}
			}
		}

		System.out.println("La apuesta maxima es de: " + apuestasegura[0]);

		for (int i = 0; i < apuestasegura.length - 1; i++) {

			for (int j = 0; j < apuestasegura.length - i - 1; j++) {

				if (apuestasegura[j] > apuestasegura[j + 1]) {

					temporal = apuestasegura[j + 1];
					apuestasegura[j + 1] = apuestasegura[j];
					apuestasegura[j] = temporal;

				}
			}
		}

		System.out.println("La apuesta minima es de: " + apuestasegura[0]);

		for (int i = 0; i < apuestasegura.length - 1; i++) {

			for (int j = 0; j < apuestasegura.length - i - 1; j++) {

				if (apuestasegura[j] > apuestasegura[j + 1]) {

					temporal = apuestasegura[j];

					apuestasegura[j] = apuestasegura[j + 1];

					apuestasegura[j + 1] = temporal;
				}

			}

		}

		System.out.println("Las apuestas ordenadas de forma ascendiente son: ");

		for (int ordenamientomayor : apuestasegura) {

			System.out.println(ordenamientomayor);

		}
	}
}
