package Desafio48;

import java.util.Arrays;

import java.util.Scanner;

public class Desafio48 {

public static void main(String[] args) {

	Scanner data = new Scanner (System.in);
	
	String[] apellidos = new String[4];
	
	for (int i = 0; i < apellidos.length; i++) {
		
		System.out.println("Ingrese el apellido n°" + (i + 1) + ": ");
	apellidos[i] = data.next();	
		
	}
	
	Arrays.sort(apellidos);
	
	System.out.println("\nLos apellidos ordenados alfabeticamente son: ");
	
	for (int i = 0; i < apellidos.length; i++) {
		
	System.out.println(apellidos[i]);	
		
	}
}	
}
