package desafio32;

import java.util.Scanner;

public class desafio32 {

public static void main(String[] args) {
	
	Scanner data = new Scanner (System.in);
	
	int n1, multi;
//	boolean salir = false;
//	char opcion;
	
		System.out.println("Ingrese un numero a multiplicar: ");
	n1 = data.nextInt();	
		
	for (int i = 1; i < 21; i++) {
		
	multi =	n1 * i;
		
		System.out.println(n1 + " * " + i + " = " + multi);
//	if (i == 20) {
//		
//		System.out.println("Desea salir? (S/N) : ");
//	opcion = data.next().charAt(0);
//	
//	if (opcion == 'S' || opcion == 's') {
//		
//		salir = true;
//		
//	}
//	
//	}
	}
	
	
	
}	
}
