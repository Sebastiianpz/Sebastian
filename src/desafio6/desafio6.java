package desafio6;

import java.util.Scanner;

public class desafio6 {

public static void main(String[] args) {

	Scanner datos = new Scanner (System.in);
	
		float nota;
		
			System.out.println("Ingresa la calificacion que te sacaste en el examen con decimales(1-10): ");
		nota = datos.nextFloat();
		
		int entero = (int) Math.round(nota);
		
			System.out.println("El numero redondeado es: " + entero);
	
	
	
	
}
}
