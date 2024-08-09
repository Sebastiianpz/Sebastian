package desafio59_Enum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class desafio59_Enum {

	public static void main(String[] args) {

		Scanner data = new Scanner(System.in);

		System.out.println("Ingrese su edad: ");
		int edad = data.nextInt();

//		while (edad < 0) {

			try {

				if (edad < 0) {

					throw new ArithmeticException();	
				}
				
			} catch (ArithmeticException e) {

				System.out.println("Error numero negativo. Intentar de vuelta: ");
				edad = data.nextInt();

			} catch (InputMismatchException e) {
				
				System.out.println("Ingresar un numero valido: ");
				edad = data.nextInt();
			}
			
			finally {

				if (edad > 0) {

					System.out.println("Su edad es: " + edad);
				}
			}
//		}
	}
}
