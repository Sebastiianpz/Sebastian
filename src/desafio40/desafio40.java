package desafio40;

import java.util.Scanner;

public class desafio40 {

public static void main(String[] args) {
	
	Scanner data = new Scanner (System.in);
	
	int[] temp = new int[5];
	int suma = 0, divi = 0;
	
	for (int i = 0; i <= 4; i++) {
		
		System.out.println("Ingrese la temperatura n" + i + ": ");
	temp[i] = data.nextInt();	
		
	suma = suma + temp[i];
	}
	
	divi = suma / 5;
	
		System.out.println("El promedio de las temperaturas es de: " + divi);
}	
}
