package desafio61_Enum;

import java.util.InputMismatchException;

import java.util.Scanner;

public class desafio61_Enum {

	public static void main(String[] args) {

		Scanner data = new Scanner(System.in);

		try {

			System.out.println("Ingresar un numero entero a aplicar raiz: ");
			int numeroRaiz = data.nextInt();

			if (numeroRaiz < 0) {

				throw new ArithmeticException();
			}
			
			  double raizCuadrada = Math.sqrt(numeroRaiz);
	          System.out.println("La raíz cuadrada de " + numeroRaiz + " es " + raizCuadrada);

		} catch (ArithmeticException e) {

			System.out.println("No se puede aplicar raiz a un numero negativo.");

		} catch (InputMismatchException e) {

			System.out.println("Dato no valido.");
			data.next();
		}
	}
}