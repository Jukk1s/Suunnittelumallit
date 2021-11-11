
public class Pokemon {
	private PokemonState state;
	
	public Pokemon() {
		state = Charmander.getInstance();
	}
	
	public void attack() {
		state.attack(this); //delegointi
	}
	
	public void defend() {
		state.defend(this);
	}
	
	protected void evolve(PokemonState s) {
		state = s;
	}
}
