package desafio39_Enum;

import java.util.Scanner;

public class desafio39_Enum {

public static void main(String[] args) {
	
	Scanner data = new Scanner (System.in);
	
	desafio39_Enums dia;
	String mesingresado;
	
	System.out.println("Ingrese un mes para saber cuantos dias tiene: ");
	mesingresado = data.nextLine().toUpperCase();
	
	dia = desafio39_Enums.valueOf(mesingresado);
	
	switch(dia) {
	case ENERO:
		System.out.println("31 dias");
		break;
	case FEBRERO:
		System.out.println("28 dias(este año 29)");
		break;
	case MARZO:
		System.out.println("31 dias");
		break;
	case ABRIL:
		System.out.println("30 dias");
		break;
	case MAYO:
		System.out.println("31 dias");
		break;
	case JUNIO:
		System.out.println("30 dias");
		break;
	case JULIO:
		System.out.println("31 dias");
		break;
	case AGOSTO:
		System.out.println("31 dias");
		break;
	case SEPTIEMBRE:
		System.out.println("30 dias");
		break;
	case OCTUBRE:
		System.out.println("31 dias");
		break;
	case NOVIEMBRE:
		System.out.println("30 dias");
		break;
	case DICIEMBRE:
		System.out.println("31 dias");
		break;
	}
	
	
	
	
	
}	
}
