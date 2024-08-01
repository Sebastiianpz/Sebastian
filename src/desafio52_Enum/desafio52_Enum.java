package desafio52_Enum;

import java.util.Scanner;

public class desafio52_Enum {

	static Scanner data = new Scanner(System.in);
	static int valorTotal;

	public static int descontar(int valorTotal) {

		if (valorTotal > 15000) {

			int descuento = (int) (valorTotal - (valorTotal * 0.1));
			return descuento;

		} else {
			return valorTotal;
		}
	}

	public static int ingresarTotal() {

		System.out.println("\nIngrese el valor total: ");
		valorTotal = data.nextInt();

		return valorTotal;
	}

	public static void main(String[] args) {

		System.out.println("El valor total es de: " + descontar(28000));
		System.out.println("\nEl valor total es de: " + descontar(11000));

		System.out.println("\n" + descontar(ingresarTotal()));
	}

}