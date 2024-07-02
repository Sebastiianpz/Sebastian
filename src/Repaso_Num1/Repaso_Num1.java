package Repaso_Num1;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

public class Repaso_Num1 {

	public static void main(String[] args) {

		Scanner data = new Scanner(System.in);

		List<Integer> lista_dni = new ArrayList();

		List<String> lista_apellido = new ArrayList();

		System.out.println("Ingrese 4 dni: ");
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

		boolean encontrado = false;
		boolean BuscarOtro = true;

		while (BuscarOtro == true) {

			System.out.println("\nIngrese un dni para verificar si esta en la lista: ");
			int lista_dni_ingresado = data.nextInt();

			for (int i = 0; i < lista_dni.size(); i++) {

				if (lista_dni_ingresado == lista_dni.get(i)) {

					System.out.println(
							"El DNI: '" + lista_dni.get(i) + "' corresponde al apellido: " + lista_apellido.get(i));
					encontrado = true;

					System.out.println("Ingresar// 1. Eliminar; 2. Modificar; 3. Salir del programa");
					int ingresado = data.nextInt();

					switch (ingresado) {

					case 1:
						lista_dni.remove(i);
						lista_apellido.remove(i);

						System.out.println("La nueva lista es: " + lista_dni);
						break;

					case 2:

						System.out.println("Que desea modificar?// 1. DNI; 2. APELLIDO; 3. AMBOS");
						int ingresadoswitch = data.nextInt();

						if (ingresadoswitch == 1 || ingresadoswitch == 3) {

							System.out.println("Ingrese el nuevo dni: ");
							int NuevoDNI = data.nextInt();

							lista_dni.set(i, NuevoDNI);

							System.out.println("La nueva lista de DNI es: " + lista_dni);

						}

						if (ingresadoswitch == 2 || ingresadoswitch == 3) {

							System.out.println("Ingrese el nuevo apellido:");
							String NuevoAPELLIDO = data.next();

							lista_apellido.set(i, NuevoAPELLIDO);

							System.out.println("La nueva lista de APELLIDOS es: " + lista_apellido);
						}
						break;

					case 3:

						System.out.println("Saliste del programa.");
						BuscarOtro = false;
						break;

					default:

						System.out.println("Opcion invalida.");
						break;

					}
					
						break;
					
				}	BuscarOtro = false;
				
				System.out.println("Desea buscar otro dni? (S/N):");
				char opcion = data.next().charAt(0);
				
				if(opcion == 'S' || opcion == 's') {
					
					BuscarOtro = true;
					
				}
				
				else {
					
					System.out.println("Programa terminado.");
				}

				if (encontrado = false) {
					
					System.out.println("El DNI no esta en la lista.");
					break;
				}
					
			}
		}
	}
}
