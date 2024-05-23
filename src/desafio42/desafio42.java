package desafio42;

import java.util.Scanner;

public class desafio42 {
	
public static void main(String[] args) {
	
	Scanner data = new Scanner (System.in);
	
	int[] adivinar = new int[3];
	double random = (int) (Math.random()*50);
	boolean adivino = false;
	
	for(int i = 0; i <3; i++) {
		
	if (adivino == false) {
		
		System.out.println("Ingrese un numero: ");
	adivinar[i] = data.nextInt();
	
	}
			
	if (adivinar[i] == random) {
			
		System.out.println("Felicidades, ganaste!");
		adivino = true;	
		
		}
 }
	if (adivino == false) {
		
		System.err.println("\nPerdiste pichonazo.");
	
	}	
		
		
		
		
   }
}
     
