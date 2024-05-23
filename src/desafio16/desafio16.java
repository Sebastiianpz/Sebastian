package desafio16;

import java.util.Scanner;

public class desafio16 {

public static void main(String[] args) {
	Scanner data = new Scanner (System.in);
	
	int hora, minuto, segundo;

		System.out.println("Ingrese la hora: ");
	hora = data.nextInt();
	
		System.out.println("Ingrese los minutos: ");
	minuto = data.nextInt();
	
		System.out.println("Ingrese los segundos: ");
	segundo = data.nextInt();
	
	if (hora > 24 || minuto > 60 || segundo > 60) {
		
		System.out.println("Valores invalidos");
		
	} else {
		
		System.out.println("Valores validos");
	}
	
	
	
	
	
	
}		
}
