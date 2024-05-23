package desafio44;

import java.util.Scanner;

public class desafio44 {

	public static void main(String[] args) {

		Scanner data = new Scanner(System.in);

		int[] dni = {48318493, 34514951, 47123321, 42135758, 34513548};
//
//		for (int i = 0; i < 5; i++) {
//
//			System.out.println("Ingresa el dni n°" + i + ": ");
//			dni[i] = data.nextInt();
//
//		}

		for (int i = 0; i < 4; i++) {

			if (dni[i] % 2 == 0) {

				System.out.println(dni[i]);

			}

		}

	}
}
