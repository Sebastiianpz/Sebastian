package desafio22;

import java.util.Scanner;

public class desafio22 {

public static void main(String[] args) {
	
	Scanner data = new Scanner (System.in);
	
	int numganado, numingresado, intentos = 1;
	double random;
	
			System.out.println("///BINGO///");
	
			System.out.println("Trate de adivinar el num ganador, ingrese un numero: ");
	numingresado = data.nextInt();
		
	random = (int) (Math.random()*100);
	
	while (numingresado != random) {
			
			System.err.println("Incorrecto");
			System.out.println("Ingrese un numero: ");
	numingresado = data.nextInt();
			intentos++;
			System.out.println(random);
			
		}
	
			System.out.println("FELICIDADES! GANASTE!!");
			System.out.println("La cantidad de intentos que le tomo fue: " + intentos);
	
	
	
}
}
