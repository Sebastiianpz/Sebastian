package desafio44_Enum;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class desafio44_Enum {

	public static void main(String[] args) {

		Scanner data = new Scanner(System.in);

		String equipo;

		List<String> lista = new ArrayList<>();

		System.err.println("Se registraran equipos de futbol.");

		System.out.println("Ingrese elementos a la lista (escriba 'fin' para terminar):");
		equipo = data.nextLine();

		while (!equipo.equalsIgnoreCase("fin")) {

			lista.add(equipo);
			equipo = data.nextLine();
		}

		HashSet<String> listanueva = new HashSet<>(lista);

		lista.clear();

		lista.addAll(listanueva);

		System.out.println("Lista creada por el usuario sin elementos duplicados: ");
		for (String ListaSinDuplicados : lista) {

			System.out.println(ListaSinDuplicados);

		}

		System.out.println("Cantidad de elementos de la lista: " + lista.size());

	}
}
