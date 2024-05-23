package desafio4;

import java.util.Scanner;

public class deasafio4 {

public static void main(String[] args) {

			Scanner datos = new Scanner(System.in);

		int semanas, meses, anos, dias;

		System.out.println("Ingrese una cantidad de años: ");
				anos = datos.nextInt();

		System.out.println("Ingrese una cantidad de meses: ");
				meses = datos.nextInt();

		System.out.println("Ingrese una cantidad de semanas(se multiplica por 30): ");
				semanas = datos.nextInt();

			dias = semanas * 7 + meses * 30 + anos * 365;

		System.out.println("Los dias totales son: " + dias);

	}
}
