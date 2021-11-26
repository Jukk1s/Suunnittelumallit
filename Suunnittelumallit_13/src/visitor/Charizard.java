package visitor;

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
	
	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
	public void attack(Pokemon p) {
		System.out.println("---Blast Burn---");
		System.out.print("Charizard: " + (points += 14) + " points \n");	
	}
	
	public void defend(Pokemon p) {
		System.out.println("---Defend---");
		System.out.print("Charizard: " + (points += 8) + " points \n");

	}
	
	public void evolve(Pokemon p) {}
	
	public void accept(PokemonStateVisitor visitor) {
		visitor.visit(this);
	}
}
