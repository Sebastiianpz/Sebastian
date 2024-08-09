package desafio62_Enum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class desafio62_Enum {

	public static void main(String[] args) {

		Scanner data = new Scanner(System.in);

		String[] apellidos = { "Avalos", "Davalos", "Giovinazzo", "Gonzalez", "Munoz" };

		System.out.println("Ingrese un numero de empleado (0-4)");

		try {	

			int numeroABuscar = data.nextInt();

			if (numeroABuscar < 0 || numeroABuscar >= 5) {

				throw new IndexOutOfBoundsException();
			}

			System.out.println("El apellido en el índice " + numeroABuscar + " es: " + apellidos[numeroABuscar]);

		}  catch (InputMismatchException e) {

			System.out.println("Dato no valido.");
			data.next();

		}
		catch (IndexOutOfBoundsException e) {

			System.out.println("Rango de array invalido.");

		}finally {

			data.close();
		}
	}
}
