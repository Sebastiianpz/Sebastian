package desafio19;

import java.util.Scanner;

public class desafio19 {

public static void main(String[] args) {
	
	Scanner data = new Scanner (System.in);
	
	int n1;
	
		System.out.println("° 1: cafe cortado.\r"
				+ "° 2: cafe latte.\r"
				+ "° 3: cafe solo.\r"
				+ "° 4: cafe lagrima.\r"
				+ "° 5: salir del programa.");
	n1 = data.nextInt();	
	
	if(n1 == 1) {
		
		System.out.println("Cafe cortado.");
		
	} else if (n1 == 2) {
		
		System.out.println("Cafe latte.");
		
	} else if (n1 == 3) {
		
		System.out.println("Cafe solo.");
		
	} else if (n1 == 4) {
		
		System.out.println("Cafe lagrima");
		
	} else if (n1 == 5) {
		
		System.out.println("Has salido del programa");
		
	} else {
		
		System.out.println("Error");
		
	}
	
	
	
	
	
	
	
	
	
}
}
