package desafio36;

import java.util.Scanner;

public class desafio36 {

public static void main(String[] args) {
	
Scanner data = new Scanner (System.in);
	
	int dinero, max = 0, min = 100000000, suma = 0, horaprime = 0, horanoob = 0;

	     for (int i = 8; i <= 17; i++) {
	    	 
	    	 System.out.println("Ingrese el dinero ganado a las " + i + "h: ");
	    dinero = data.nextInt();
	    
	    	suma = suma + dinero;
	    	
	    if (dinero >= max) {
	    	
	    	max = dinero;
	    	horaprime = i;
	    }
	    if (dinero <= min) {
	    	
	    	min = dinero;
	    	horanoob = i;
	    }
	     }
	        
	       
	        System.out.println("\nLa cantidad de dinero ganado mas alto es: $" + max + " a las: " + horaprime + "h");
	        System.out.println("La cantidad de dinero de menor cantidad ganada es: $" + min + " a las: " + horanoob + "h");

	        System.out.println("La cantidad total ganada de la jornada de trabajo es de: $" + suma);
	
	
	
	
	
	
	
	
}	
}
