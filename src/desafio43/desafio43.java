package desafio43;

import java.util.Scanner;

public class desafio43 {

	//private static final int i = 0;

	public static void main(String[] args) {

		Scanner data = new Scanner(System.in);

		int[] num = new int[5];

		for (int i = 0; i < 5; i++) {

			System.out.println("Ingrese el n" + i + ": ");
			num[i] = data.nextInt();

		}

		for (int i = 0; i < 5; i++) {

			if (num[i] > 0) {
				System.out.println(num[i]);

			}

		}

	}
}
