package desafio57_Enum;

import java.util.Scanner;

public class desafio57_Enum {

	static Scanner data = new Scanner(System.in);

	public static void ingresoCorreo() {

		String correo;
		boolean tienearroba = false;
		boolean tienepunto = false;

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
	}

	public static void ingresoContrase�a() {

		String contrase�a;
		boolean contrase�alongitud = false;
		
		while (contrase�alongitud == false) {

			System.out.println("Ingrese su contrase�a: ");
			contrase�a = data.next();

			if (contrase�a.length() > 12) {

				System.out.println("Sobrepasa la cantidad de caracteres.\n");
			}
			
			else if (contrase�a.length() < 6) {

				System.out.println("Pocos caracteres.\n");
			}
			
			else {

				System.out.println("\nIngreso de contrase�a correcta.\n");
				contrase�alongitud = true;
			}
		}
	}

	public static void main(String[] args) {

		ingresoCorreo();
		ingresoContrase�a();
	}
}
