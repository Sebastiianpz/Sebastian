package desafio59_Enum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class desafio59_Enum {

	static Scanner data = new Scanner(System.in);

	static int edad;

	public static void ingresoEdad() {

		System.out.println("Ingrese su edad: ");
		edad = data.nextInt();
//
//		while (edad < 0) {
//			
//			try {
//				
//				if(edad < 0) {
//					
//					throw new ArithmeticException("La edad no puede ser un numero negativo.");
//				}	
//			}	
//			
//			catch (InputMismatchException e) {
//       
//                System.out.println("Error: Debe ingresar un número válido.");
//			
//			
//			}

		while (edad < 0) {

			try {

				if (edad < 0) {

					throw new ArithmeticException("La edad no puede ser un número negativo.");
				}

			} catch (InputMismatchException e) {
				
				System.out.println("Error: Debe ingresar un número válido.");

			} catch (ArithmeticException e) {
				
				System.out.println("Error: " + e.getMessage());

			} finally {
	
				if (edad < 0) {
					System.out.println("Por favor, intente de nuevo.");
				}
			}
		}

		System.out.println("Su edad es: " + edad);
	}

	public static void main(String[] args) {
			ingresoEdad();
	}
}
