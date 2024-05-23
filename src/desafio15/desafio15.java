package desafio15;

import java.util.Scanner;

public class desafio15 {

public static void main(String[] args) {

	Scanner data = new Scanner (System.in);
	
	float gasto, valormax = 15000;
	double descuento;
		System.out.println("//OFERTON!, SI GASTAS MAS DE 15.000 TENES 10% DE DESCUENTO//\n");
		
		System.out.println("Ingrese cuanto gasto: ");
	gasto = data.nextFloat();	
	
	descuento = gasto-(gasto*0.1);
	
	if ( gasto >= valormax) {
		
		System.out.println("Se aplico el 10% de descuento.");
		System.out.println("El precio final es de: " + descuento);
			
		} else { 
		
		System.out.println("No se aplico descuento.");
		System.out.println("El precio final es de: " + gasto);
		
	}
	
	
	
	
	
	
	
}
}
