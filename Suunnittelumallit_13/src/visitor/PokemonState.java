package visitor;

public abstract class PokemonState {
	Pokemon pokemon;
	static int pointsToEvolve = 100;
	
	public PokemonState() {}
	
	abstract void attack(Pokemon p);
	abstract void defend(Pokemon p);
	
	void evolve(Pokemon p, PokemonState s) {
		p.evolve(s);
	}
	
	abstract void accept(PokemonStateVisitor visitor);
	
	
}
