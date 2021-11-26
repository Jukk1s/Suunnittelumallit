package visitor;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Pokemon pokemon = new Pokemon();
		PokemonStateVisitor visitor = new PokemonVisitor();
		Random r = new Random();
		
		while (true) {
			if (r.nextDouble() >= 0.5) {
				pokemon.attack();
			} else 
				pokemon.defend();
			
			pokemon.accept(visitor);
			
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		}
		
	}
}
