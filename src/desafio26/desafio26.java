package desafio26;

import java.util.Scanner;

public class desafio26 {

public static void main(String[] args) {
	
	Scanner data = new Scanner (System.in);
	
	int contra = 2008, intentosrestantes = 2, contraingresada;
	
		System.out.println("///Info: cumpleaņos del programador en cuestion///\n");
		
	do {
		
		System.out.println("Ingrese la contraseņa: ");
	contraingresada = data.nextInt();
	if (contra == contraingresada) {
		
		
		System.out.println("\nIngresaste al sistema.");
	} else {
	
		System.out.println("\nIntentos restantes: " + intentosrestantes);
		intentosrestantes--;
	}
	
	} while (contra != contraingresada && intentosrestantes >= 0);
	
	if (intentosrestantes <= 0) {
		
		System.err.println("Bloqueado.");
		
	}
	
		
	
	
	
	
	
	
}	
}
