package desafio3;

import java.util.Scanner;

public class desafio3 {
	
public static void main(String[] args) {
	
	Scanner datos = new Scanner (System.in);
	
	float n1,n2,suma,resta,divi,multi;
	int sumaint, restaint, diviint, multiint;
	
		System.out.println("Ingrese un numero: ");
			n1 = datos.nextFloat();
		
		System.out.println("Ingrese otro numero: ");
			n2 = datos.nextFloat();
	
	suma = n1 + n2;
	resta = n1 - n2;
	divi = n1 / n2;
	multi = n1 * n2;
	
	
	sumaint = (int) suma;
	restaint = (int) resta;
	diviint = (int) divi;
	multiint = (int) multi;
	
		System.out.println("El resultado de la suma es: " + suma);
		System.out.println("El resultado de la suma sin decimal es: " + sumaint);
		
		System.out.println("\nEl resultado de la resta es: " + resta);
		System.out.println("El resultado de la resta sin decimal es: " + restaint);

		System.out.println("\nEl resultado de la divi es: " + divi);
		System.out.println("El resultado de la divi sin decimal es: " + diviint);
		
		System.out.println("\nEl resultado de la multi es: " + multi);
		System.out.println("\nEl resultado de la multi sin decimal es: " + multiint);

		


	
	
	
	
	
	
	
	
	
	
	
}
}
