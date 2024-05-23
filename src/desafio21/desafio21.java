package desafio21;

public class desafio21 {

	public static void main(String[] args) throws InterruptedException {

		int t = 35;
		
		while (t < 100) {

			System.out.println(t+"°");
			if (t <= 85) {
			
			t += 2;
			}
			Thread.sleep(2000);

			if (t >= 87) {
				
				if (t==87) {
					
			System.out.println("CUIDADO!, TEMPERATURA PELIGROSA");
			System.out.println(t+"°");
				}

				
				Thread.sleep(2000);
				t++;
			}

			if (t == 100) {

				System.out.println("VALOR EXTREMO, APAGANDO PC");

			}

		}
	}
}