package desafio23;

import java.util.Scanner;

public class desafio23 {

public static void main(String[] args) {
	
	Scanner data = new Scanner (System.in);
	
	int numganado, numingresado, intentostomados = 1;
	double random;
	String nombre, apellido;
	boolean quedanIntentos = true;
	
		System.out.println("///BINGO///");
		System.out.println("Ingrese su nombre: ");
	nombre = data.next();
		System.out.println("Ingrese su apellido");
	apellido = data.next();
		System.out.println("Trate de adivinar el num ganador, ingrese un numero: ");
		System.out.println("5 intentos.");
		
	numingresado = data.nextInt();
		
	random = (int) (Math.random()*100);
		
		System.out.println(nombre);
		System.out.println(apellido);
		
		while (numingresado != random && quedanIntentos==true) {
			
			System.out.println("Quedan " + intentostomados + " intentos");
			System.out.println("Ingrese un numero: ");
	numingresado = data.nextInt();
			intentostomados++;
			if (intentostomados==5) {
				quedanIntentos = false;
			}
			
		}
		if (quedanIntentos==true) {
			
				System.out.println("FELICIDADES! GANASTE!!");
			System.out.println("La cantidad de intentos que le tomo fue: " + intentostomados);
			
		}
			
		else {
			
			System.err.println("Perdiste.");
			
		}
	

	
	
	
	
	
	
	
}	
	
}
