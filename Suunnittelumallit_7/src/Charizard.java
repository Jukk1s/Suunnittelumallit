
public class Charizard extends PokemonState {
	private static Charizard instance = null;
	private int points;
	
	private Charizard() {
		super();
		points = 0;
	}
	
	public static Charizard getInstance() {
		if (instance == null) {
			return new Charizard();
		}
		return instance;
	}
	
	public void attack(Pokemon p) {
		System.out.println("---Blast Burn---");
		System.out.println("Charizard: " + (points += 15) + " points \n");	
	}
	
	public void defend(Pokemon p) {
		System.out.println("---Defend---");
		System.out.println("Charizard: " + (points += 8) + " points \n");

	}
	
	public void evolve(Pokemon p) {
	}	
}
