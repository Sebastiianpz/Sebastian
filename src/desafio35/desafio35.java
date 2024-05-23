package desafio35;

import java.util.Scanner;

public class desafio35 {

public static void main(String[] args) {
	
	Scanner data = new Scanner (System.in);
	
	int notas, max = 0, min = 10, suma = 0, divi = 0;

	     for (int i = 1; i <= 5; i++) {
	    	 
	    	 System.out.println("Ingrese la nota(1-10) n" + i + ": ");
	    notas = data.nextInt();
	    	suma = suma + notas;
	    	
	    if (notas >= max) {
	    	
	    	max = notas;
	    }
	    if (notas < min) {
	    	
	    	min = notas;
	    	
	    }
	     }
	        
	       
	        System.out.println("\nEl número más alto es: " + max);
	        System.out.println("El número más bajo es: " + min);
	    
	divi = suma / 5;

			System.out.println("El promedio del alumno es del: " + divi);
	
	
	
	
}	
}