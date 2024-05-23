package desafio12;

import java.util.Scanner;

public class desafio12 {

		public static void main(String[] args) {
		
		Scanner data = new Scanner (System.in);
		
	int n1;
	
//		System.out.println("Su nota es: " + n1);
		System.out.println("Ingrese su nota sacada en Lab. de Algoritmos (1-10): ");
	n1 = data.nextInt();
	
	if ( n1 <= 1 || n1 <= 3 ) {
		
		System.out.println("Insuficiente.");
		
	} else if ( n1 > 3 && n1 < 6 ) {
		
		System.out.println("No logrado");
		
	} else if ( n1 >= 6 && n1 <= 7) {
		
		System.out.println("Suficiente.");
		
	} else if ( n1 >= 8 && n1 <= 9) {
		
		System.out.println("Notable.");
		
	} else if ( n1 == 10) {
		
		System.out.println("Sobresaliente.");
		
	} else {
		
		System.out.println("Ingresaste cualquier cosa");
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
