package desafio30;

public class desafio30 {

public static void main(String[] args) throws InterruptedException {
	
	for (int i = 0; i < 100; i = i + 1) {
		Thread.sleep(200);
		System.out.println("Cantidad de seguidores: " + i);
	}
	
		System.out.println("LLEGASTE A LOS 100 SEGUIDORES!!!");	
}		
}
