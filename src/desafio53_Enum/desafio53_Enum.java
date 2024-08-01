package desafio53_Enum;

import java.util.Scanner;

public class desafio53_Enum {

	static Scanner data = new Scanner(System.in);
	static int notas, max = 0, min = 10, suma = 0, divi = 0;

	public static void ingresarNotas() {

		for (int i = 1; i <= 5; i++) {

			System.out.println("Ingrese la nota(1-10) n" + i + ": ");
			notas = data.nextInt();
			
		}
	}

	public static int mayorMenor() {

		if (notas >= max) {

			max = notas;
			return max;
		}
		else {
			
			min = notas;
			return min;
		}
	}
	
	public static int cuentasNotas() {
		
		suma = suma + notas;
		divi = suma / 5;
		
		return divi;
	}
	
	public static void main(String[] args) {
		
		ingresarNotas();
		System.out.println(mayorMenor());
		cuentasNotas();
		
		
	}
}
