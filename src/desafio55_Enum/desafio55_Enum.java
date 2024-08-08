package desafio55_Enum;

import java.util.Scanner;

public class desafio55_Enum {

	static Scanner data = new Scanner(System.in);

	static int[] dni = new int[3];

	public static void ingresoDNI() {

		for (int i = 0; i < dni.length; i++) {

			System.out.println("Ingrese el dni n°" + (i + 1) + ": ");
			dni[i] = data.nextInt();
		}
	}

	public static void ordenDescendiente() {

		for (int i = 0; i < dni.length - 1; i++) {

			for (int j = 0; j < dni.length - i - 1; j++) {

				if (dni[j] < dni[j + 1]) {

					int temporal = dni[j + 1];

					dni[j + 1] = dni[j];

					dni[j] = temporal;
				}
			}
		}

		System.out.println("\nLos dni ordenados en forma descendiente son: ");

		for (int ordenadomenor : dni) {

			System.out.println(ordenadomenor);

		}

	}

	public static void ordenAscendiente() {

		for (int i = 0; i < dni.length - 1; i++) {

			for (int j = 0; j < dni.length - i - 1; j++) {

				if (dni[j] > dni[j + 1]) {

					int temporal = dni[j];

					dni[j] = dni[j + 1];

					dni[j + 1] = temporal;
				}

			}

		}

		System.out.println("\nLos dni ordenados de forma ascendiente son: ");

		for (int ordenamientomayor : dni) {

			System.out.println(ordenamientomayor);

		}

	}

	public static void main(String[] args) {
		
		ingresoDNI();
		ordenDescendiente();
		ordenAscendiente();
		
	}

}
