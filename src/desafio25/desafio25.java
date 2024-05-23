package desafio25;

import java.util.Scanner;

public class desafio25 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner (System.in);
		
		String respuestapapa;
		
		boolean siono = false;
		
			do { 
				
				System.out.println("¿Puedo salir?");
			respuestapapa = data.next();
			
			if (respuestapapa.equals("SI")) {
				
			siono = true;
				System.out.println("Gracias pa");
			}
				
			} while (siono == false);
			
			
		
		
		
		
		
		
		
		
		
		
	}
}
