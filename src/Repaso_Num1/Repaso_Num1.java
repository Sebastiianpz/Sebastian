package Repaso_Num1;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

public class Repaso_Num1 {

	public static void main(String[] args) {

		Scanner data = new Scanner(System.in);

		List<Integer> lista_dni = new ArrayList();

		List<String> lista_apellido = new ArrayList();

		System.out.println("Ingrese 4 dni  ");
		int lista_dni1;

		for (int i = 0; i < 4; i++) {
			lista_dni1 = data.nextInt();
			lista_dni.add(lista_dni1);

		}

		System.out.println("Ingrese 4 apellidos: ");
		String lista_apellido1 = data.nextLine();

		for (int i = 0; i < 4; i++) {
			lista_apellido1 = data.next();
			lista_apellido.add(lista_apellido1);
		}

		for (int i = 0; i < 4 - 1; i++) {

			for (int j = 0; j < 4 - i - 1; j++) {

				if (lista_dni.get(j) > lista_dni.get(j + 1)) {

					int temporalNumero = lista_dni.get(j);

					lista_dni.set(j, lista_dni.get(j + 1));

					lista_dni.set(j + 1, temporalNumero);
					
					
					String temporalString = lista_apellido.get(j);

					lista_apellido.set(j, lista_apellido.get(j + 1));

					lista_apellido.set(j + 1, temporalString);

				}
			}
		}

		System.out.println("Dni ordenados de menor a mayor(izq a der)");
		System.out.println(lista_dni);

		System.out.println("Apellidos ordenados acompañados de su dni(izq a der)");
		System.out.println(lista_apellido);

		System.out.println("Ingrese un dni para verificar si esta en la lista: ");
	int lista_dni_ingresado = data.nextInt();
	
		for (int i = 0; i < lista_dni.size(); i++) {

			if (lista_dni_ingresado == lista_dni.get(i)) {

				System.out.println("El numero de socio corresponde a: " + lista_apellido.get(i));	
			}
		}
	}
}

