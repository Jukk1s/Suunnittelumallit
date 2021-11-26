package visitor;

public interface PokemonStateVisitor {
	public void visit(Charmander charmander);
	public void visit(Charmeleon charmeleon);
	public void visit(Charizard charizard);
}
