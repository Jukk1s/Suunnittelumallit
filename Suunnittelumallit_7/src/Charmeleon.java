
public class Charmeleon extends PokemonState {
	private static Charmeleon instance = null;
	private int points;
	
	private Charmeleon() {
		super();
		points = 0;
	}
	
	public static Charmeleon getInstance() {
		if (instance == null) {
			return new Charmeleon();
		}
		return instance;
	}
	
	public void attack(Pokemon p) {
		System.out.println("---Flamethrower---");
		System.out.println("Charmeleon: " + (points += 15) + " points \n");
		
		if (points >= pointsToEvolve) {
			evolve(p);
		}
	}
	
	public void defend(Pokemon p) {
		System.out.println("---Defend---");
		System.out.println("Charmeleon: " + (points += 8) + " points \n");
		
		if (points >= pointsToEvolve) {
			evolve(p);
		}
	}
	
	public void evolve(Pokemon p) {
		System.out.println("Charmeleon evolves into...");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("~~~ Charizard! ~~~ \n");
		evolve(p, Charizard.getInstance());
	}	
}
