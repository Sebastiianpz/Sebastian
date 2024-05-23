package desafio34;

import java.util.Scanner;

public class desafio34 {

public static void main(String[] args) {
	
	Scanner data = new Scanner (System.in);
	
	int cantidad;
	
	for (int i = 1; i <= 12; i++) {
		
		System.out.println("Ingrese la cantidad de ingresos del mes " + i + ": ");
	cantidad = data.nextInt();
		
		if (cantidad < 100000) {
			
			System.out.println("En el mes " + i + " tuvo un ingreso menor a $100.000\n");
		}
}
	
	
	
	
	
	
	
}	
}
