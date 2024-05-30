package desafio47;

import java.util.Arrays;

import java.util.Scanner;

public class desafio47 {

public static void main(String[] args) {
	
	Scanner data = new Scanner (System.in);
	
	int[] notas = new int [3];
	
	String apellido;
	
		System.out.println("Ingrese el apellido del alumno.");
	apellido = data.next();
	
	for (int i = 0; i < notas.length; i++) {
		
		System.out.println("Ingrese la nota n°" + (i + 1) + " del alumno: ");
	notas[i] = data.nextInt();	
			
		}
	
	int[] notasCopy = notas.clone();
	Arrays.sort(notasCopy);
	
		System.out.println("\nArray desordenado.\n");
	
	for (int i = 0; i < notas.length; i++) {
		
		System.out.println("nota n°" + (i + 1) + ": " + notas[i]);
	}
	
		System.out.println("\nArray ordenado.\n");
	
	for (int i = 0; i < notas.length; i++) {
		
		System.out.println("nota n°" + (i + 1) + ": " + notasCopy[i]);
		
	}
	
	}		
}
