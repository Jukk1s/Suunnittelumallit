package visitor;

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
	
	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public void attack(Pokemon p) {
		System.out.println("---Fire Spin---");
		System.out.print("Charmander: " + (points += 14) + " points \n");
		
		if (points >= pointsToEvolve) {
			evolve(p);
		}
	}
	
	public void defend(Pokemon p) {
		System.out.println("---Defend---");
		System.out.print("Charmander: " + (points += 8) + " points \n");
		
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
	
	public void accept(PokemonStateVisitor visitor) {
		visitor.visit(this);
	}
}
