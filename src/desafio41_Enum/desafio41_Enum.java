package desafio41_Enum;

import java.util.Iterator;
import java.util.Scanner;

public class desafio41_Enum {

	public static void main(String[] args) {

	Scanner data = new Scanner (System.in);
	
	String[] nombres = new String[11];
	int [] edades = new int[11];
	
	for (int i = 0; i < nombres.length; i++) {
		
		System.out.println("Ingrese el nombre del jugador #" + (i + 1) + ": ");
		nombres[i] = data.next();
		
	}
	
	for (int i = 0; i < edades.length; i++) {
		
		System.out.println("Ingrese la edad del jugador #" + (i + 1) + ": ");
		edades[i] = data.nextInt();
		
	}

	
	
	
	for (int i = 0; i < 11; i++) {
		
		System.out.println("El nombre del jugador #" + (i + 1) + " es "+ nombres[i] + " y tiene " + edades[i] + " años");
		
	}
	
	
	
	
	}

}
