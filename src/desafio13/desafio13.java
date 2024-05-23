package desafio13;

import java.util.Scanner;

public class desafio13 {

public static void main(String[] args) {

	Scanner data = new Scanner (System.in);
	
	char talle;
	
		System.out.println("Ingrese el talle que quiera (s-m-l): ");
		
	talle = data.next().charAt(0);
	
		if (talle == 's' || talle == 'S') {
		
		System.out.println("Quedan 5 remeras.");
		
	}	else if (talle == 'm' || talle == 'M') {
		
		System.out.println("Quedan 2 remeras.");
		
	}	else if (talle == 'l' || talle == 'L') {
		
		System.out.println("No quedan remeras.");
		
	}	else {
		
		System.out.println("Dato invalido.");
		
	}
	
	
	
	
	
}
}
