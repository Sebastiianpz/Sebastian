package desafio62;

import java.util.Scanner;

public class desafio62 {

	public static void main(String[] args) {

		Scanner data = new Scanner(System.in);

		String[] apellidos = new String[4];

		for (int i = 0; i < apellidos.length; i++) {

			System.out.println("Ingrese el apellido #" + (i + 1) + ": ");
			apellidos[i] = data.next();

		}

		String apellidomayor = apellidos[0];
		String apellidomenor = apellidos[0];

		for (int i = 0; i < apellidos.length; i++) {

			if (apellidos[i].compareTo(apellidomayor) > 0) {

				apellidomayor = apellidos[i];
			}
			if (apellidos[i].compareTo(apellidomenor) < 0) {

				apellidomenor = apellidos[i];
			}
		}

		System.out.println("El apellido mas grande alfabeticamente (cercano a la 'Z') es: " + apellidomayor);
		
		System.out.println("\nEl apellido mas chico alfabeticamente (cercano a la 'A') es: " + apellidomenor);
	}
}
