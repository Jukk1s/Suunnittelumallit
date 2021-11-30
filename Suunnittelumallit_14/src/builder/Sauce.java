package builder;

public class Sauce {
	private String name;
	
	public Sauce(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
