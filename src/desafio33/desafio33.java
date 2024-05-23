package desafio33;

import java.util.Scanner;

public class desafio33 {

public static void main(String[] args) {
	
	Scanner data = new Scanner (System.in);
	
	String nombre = null;
	int edad = 0;
	
	for (int i = 1; i < 12; i++) {
		
		System.out.println("Ingrese el nombre del jugador: " + i);
	nombre = data.next();
		
		System.out.println("Ingrese la edad del jugador: ");
	edad = data.nextInt();
	}
		
		System.out.println("El nombre del jugador: " + nombre);
		
		/* 
		no, no se pueden poner todos los nombres ya que
		al terminar el for y mostrar los datos en este syso (line 24)
		solo toma los ultimos datos que escribiste, perdiendose asi todos los demas datos.
		*/
		
		System.out.println("La edad del jugador es: " + edad);
	
	
	
	
	
}
}
