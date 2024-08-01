package desafio51_Enum;

import java.util.Scanner;

public class desafio51_Enum {

	static Scanner data = new Scanner(System.in);
	static int numeroIngresado;

	public static void ingresoDatos() {

		System.out.println("Ingrese cualquier numero entero: ");
		numeroIngresado = data.nextInt();

	}

	public static boolean positivoNegativo() {

		if (numeroIngresado > 0) {
			return true;
			
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		ingresoDatos();
		System.out.println(positivoNegativo());

	}
}
