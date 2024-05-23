package desafio38;

import java.util.Scanner;

public class desafio38 {

public static void main(String[] args) {

	Scanner data = new Scanner (System.in);
	
	int clientesmax = 0, clientesmin = 10000000, clientes = 0;
	
	for (int i = 9; i <= 19; i+=2) {
		
		System.out.println("Ingrese la cantidad de clientes a las: " + i + "h");
	clientes = data.nextInt();	
		
		if (clientes > clientesmax) {
			
			clientesmax = clientes;
			
		}
		
		if (clientes < clientesmin) {
			
			clientesmin = clientes; 	
			
		}
	}
	
		System.out.println("\nLa cantidad maxima de clientes fue de: " + clientesmax);
		System.out.println("La cantidad minima de clientes fue de: " + clientesmin);
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
}
