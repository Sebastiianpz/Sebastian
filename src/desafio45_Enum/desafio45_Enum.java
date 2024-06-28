package desafio45_Enum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class desafio45_Enum {

	public static void main(String[] args) {

		Scanner data = new Scanner(System.in);

		String ingreso;

		List<String> lista = new ArrayList<>();
		lista.add("ARGENTINA");
		lista.add("BOLIVIA");
		lista.add("BRASIL");
		lista.add("CHILE");
		lista.add("COLOMBIA");
		lista.add("ECUADOR");
		lista.add("GUYANA");
		lista.add("PARAGUAY");
		lista.add("PERU");
		lista.add("SURINAM");
		lista.add("URUGUAY");
		lista.add("VENEZUELA");

		Collections.sort(lista);

		System.out.println("Ingrese un pais sudamericano:");
		ingreso = data.next().toUpperCase();

		boolean existeono = lista.contains(ingreso);
		System.out.println("Su pais es sudamericano?: " + existeono); // En pantalla: true

		System.out.println("\nLista de paises ordenadas: \n");

		for (String string : lista) {
			System.out.println(string);
		}
	}
}
