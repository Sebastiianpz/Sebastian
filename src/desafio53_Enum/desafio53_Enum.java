package desafio53_Enum;

import java.util.Scanner;

public class desafio53_Enum {

	static Scanner data = new Scanner(System.in);
	
	static int notas, max = 0, min = 1000, suma = 0;
	static float divi = 0;
	
	public static void ingresarNotas() {

		for (int i = 1; i <= 5; i++) {

			System.out.println("Ingrese la nota(1-10) n" + i + ": ");
			notas = data.nextInt();
			

			if (notas <= min) {

				min = notas;
			}
			
			if (notas >= max) {

				max = notas;
			}
			suma = suma + notas;

		}
	}

	public static void menorYmayor() {
		
		System.out.println("El numero menor es: " + min);
		System.out.println("El numero mayor es: " + max);

		}
	

	

	public static void cuentasNotas() {

			divi = suma / 5;
			System.out.println("El promiedo de las 5 notas es: " + divi);
		}

	

	public static void main(String[] args) {

		ingresarNotas();
		menorYmayor();
		cuentasNotas();

	}
}
