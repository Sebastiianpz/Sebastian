package desafio63;

import java.util.Scanner;

public class desafio63 {
	public static void main(String[] args) {

		Scanner data = new Scanner(System.in);

		String correo;
		String contraseña;
		boolean tienearroba = false;
		boolean tienepunto = false;
		boolean contraseñalongitud = false;

		while (tienearroba == false && tienepunto == false) {

			System.out.println("Ingrese su correo electronico: ");
			correo = data.next();

			if (correo.indexOf('@') < 0) {

				System.out.println("Falta el '@', ingresar nuevamente.\n");
			}

			else if (correo.indexOf('.') < 0) {

				System.out.println("Falta el '.', ingresar nuevamente.\n");
			}

			else if (correo.indexOf('.') < correo.indexOf('@')) {

				System.out.println("El '.' esta antes que la '@', ingresar nuevamente.\n");
			}

			else if (correo.indexOf('@') > 0 && correo.indexOf('.') > 0) {

				System.out.println("\nIngreso de gmail correcto.\n");

				tienearroba = true;
				tienepunto = true;
			}
		}

		while (contraseñalongitud == false) {

			System.out.println("Ingrese su contraseña: ");
			contraseña = data.next();

			if (contraseña.length() > 12) {

				System.out.println("Sobrepasa la cantidad de caracteres.\n");

			} else if (contraseña.length() < 6) {

				System.out.println("Pocos caracteres.\n");
			} else {

				System.out.println("\nIngreso de contraseña correcta.\n");

				contraseñalongitud = true;
			}

		}

	}

}
