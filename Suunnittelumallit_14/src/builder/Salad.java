package builder;

public class Salad {
	private String name;
	
	public Salad(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
