package visitor;

public class PokemonVisitor implements PokemonStateVisitor {
	
	@Override
	public void visit(Charmander charmander) {
		System.out.println("(+1 bonus point!)\n");
		charmander.setPoints(charmander.getPoints()+1);
	}
	
	@Override
	public void visit(Charmeleon charmeleon) {
		System.out.println("(+2 bonus points!)\n");
		charmeleon.setPoints(charmeleon.getPoints()+2);
	}
	
	@Override
	public void visit(Charizard charizard) {
		System.out.println("(+3 bonus points!)\n");
		charizard.setPoints(charizard.getPoints()+3);
		
	}
	
}
