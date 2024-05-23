package desafio28;

public class desafio28 {

	public static void main(String[] args) throws InterruptedException {

		int bateria = 100;

		while (bateria > 0) {
			System.out.println("Bateria: " + bateria + "%");
			bateria--;
			Thread.sleep(200);
			if (bateria == 19) {

				System.out.println("Bateria baja.");
			}
			if (bateria < 20) {
				Thread.sleep(100);
			}

		}

		System.out.println("Bateria agotada.");

	}

}
