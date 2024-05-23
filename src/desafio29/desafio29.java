package desafio29;

public class desafio29 {

public static void main(String[] args) throws InterruptedException {
	
	
	for (int bateria = 100; bateria > 0; bateria--) { //al poner las 3 funciones de una ahorro 3 lineas de codigo.
		Thread.sleep(200);
		System.out.println(bateria + "%");
	if (bateria == 20) {
		System.out.println("Bateria baja.");
	}
	if ( bateria < 20) {
		Thread.sleep(300);
	}
	}
	
	System.out.println("Bateria agotada.");
	
}	
}
