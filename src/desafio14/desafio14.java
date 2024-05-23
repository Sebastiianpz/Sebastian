package desafio14;

import java.util.Scanner;

public class desafio14 {
public static void main(String[] args) {
	
	Scanner data = new Scanner (System.in);
	
	int n1, n2;
	
		System.out.println("Ingrese un numero a para dividirlo: ");
	n1 = data.nextInt();
	
		System.out.println("Ingrese el numero para saber cuantas veces quiere dividir al otro numero: ");
	n2 = data.nextInt();
	
		if (n2 != 0) {
			
			System.out.println("Se puede realizar la division.");
			
		} else {
			
			System.out.println("No se puede dividir entre 0.");
			
		}
	
	
	
	
}
}
