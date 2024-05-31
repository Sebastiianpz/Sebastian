package desafio50;

import java.util.Scanner;

public class desafio50 {
	
public static void main(String[] args) {

	Scanner data = new Scanner(System.in);

	int[] apuesta = new int[5];

		for (int i = 0; i < apuesta.length; i++) {
			
			System.out.println("Cuanto dinero desea apostar por el producto?");
				apuesta[i] = data.nextInt();
		}

		for (int i = 0; i < apuesta.length - 1; i++) {
			
			for (int j = 0; j < apuesta.length - i - 1; j++) {
					
				if (apuesta[j] > apuesta[j + 1]) {
					
					int temporal = apuesta[j + 1];
					apuesta[j + 1] = apuesta[j];
					apuesta[j] = temporal;
					
				}
			System.out.println("La apuesta maxima es de: " + apuesta[i]);
			}
			
		}
		
	}
}
