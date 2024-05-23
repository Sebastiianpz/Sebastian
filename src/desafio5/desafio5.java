package desafio5;

import java.util.Scanner;

public class desafio5 {

public static void main(String[] args) {
	
	Scanner datos = new Scanner (System.in);
	
	float n1;
	
		System.out.println("Ingrese un numero para aplicarle raiz cuadrada: ");
			n1 = datos.nextFloat();
			
	double raizq = Math.sqrt(n1);
	int raizqint = (int) Math.sqrt(raizq);
	
		System.out.println("El resultado con decimal es: " + raizq );
		System.out.println("\nEl resultado en enteros es: " + raizqint);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
