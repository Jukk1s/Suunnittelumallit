
public class Charmander extends PokemonState {
	private static Charmander instance = null;
	private int points;
	
	private Charmander() {
		super();
		points = 0;
	}
	
	public static Charmander getInstance() {
		if (instance == null) {
			return new Charmander();
		}
		return instance;
	}
	
	public void attack(Pokemon p) {
		System.out.println("---Fire Spin---");
		System.out.println("Charmander: " + (points += 14) + " points \n");
		
		if (points >= pointsToEvolve) {
			evolve(p);
		}
	}
	
	public void defend(Pokemon p) {
		System.out.println("---Defend---");
		System.out.println("Charmander: " + (points += 8) + " points \n");
		
		if (points >= pointsToEvolve) {
			evolve(p);
		}
	}
	
	public void evolve(Pokemon p) {
		System.out.println("Charmander evolves into...");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("~~~ Charmeleon! ~~~ \n");
		evolve(p, Charmeleon.getInstance());
	}	
}
