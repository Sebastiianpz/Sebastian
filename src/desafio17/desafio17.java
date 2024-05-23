package desafio17;

import java.util.Scanner;

public class desafio17 {

public static void main(String[] args) {
	
	Scanner data = new Scanner (System.in);
	
	int n1, n2, n3;
	
		System.out.println("Ingrese un numero(n1): ");
	n1 = data.nextInt();
	
		System.out.println("Ingrese un 2do numero(n2): ");
	n2 = data.nextInt();
	
		System.out.println("Ingrese un 3er numero(n3): ");
	n3 = data.nextInt();
	
	if ( n1 > n2 && n1 > n3) {
		
		System.out.println("El numero mas grande es(n1): " + n1);
		
	if (n2 > n3) {
		
		System.out.println("El numero de en medio es(n2): " + n2);
		System.out.println("El numero mas chiquito es(n3): " + n3);
			
}   else {
			
		System.out.println("El numero de en medio es(n3): " + n3);	
		System.out.println("El numero mas chiquito es(n2): " + n2);
		}
	
		
}   if ( n2 > n1 && n2 > n3) {
		
		System.out.println("El numero mas grande es(n2): " + n2);
		
	if (n1 > n3) {
		   
		System.out.println("El numero de en medio es(n1): " + n1);
		System.out.println("El numero mas chiquito es(n3): " + n3);  
		
}   else {
	
		System.out.println("El numero de en medio es(n3): " + n3);
		System.out.println("El numero mas chiquito es(n1): " + n1);
}
		
		
}   if ( n3 > n1 && n3 > n2) {
		
		System.out.println("El numero mas grande es: " + n3);
		
	if (n1 > n2) {
		
		System.out.println("El numero de en medio es(n1): " + n1);
		System.out.println("El numero mas chiquito es(n2): " + n2);
		
}   else {
	
		System.out.println("El numero de en medio es(n2): " + n2);
		System.out.println("El numero mas chiquito es(n3): " + n1);
}

}
	
	
	
	
	
	
	
	
	
	
	
}
	
}
