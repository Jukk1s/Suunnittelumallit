import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Pokemon p = new Pokemon();
		Random r = new Random();
		
		while (true) {
			if (r.nextDouble() >= 0.5) {
				p.attack();
			} else
				p.defend();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
