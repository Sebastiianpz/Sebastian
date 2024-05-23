package desafio39;

import java.util.Scanner;

public class desafio39 {

public static void main(String[] args) {
	
	Scanner data = new Scanner (System.in);
	
	String[] nombre = new String [11];
	int[] edad = new int [11];
	
	for (int i = 0; i <= 10; i++) {
		
		System.out.println("Ingrese el nombre del jugador " + i + ": ");
	nombre[i] = data.next();
		
		System.out.println("Ingrese la edad del jugador: ");
	edad[i] = data.nextInt();
	
	}

		System.out.println("");
		
	for (int i = 0; i <= 11; i++) {
		
		System.out.println("El nombre del jugador " + i + " es: " + nombre[i]);
		System.out.println("Y la edad del jugador es: " + edad[i] + "\n");
		
		
	}
	
	
	
	
	
	
	
}
}
