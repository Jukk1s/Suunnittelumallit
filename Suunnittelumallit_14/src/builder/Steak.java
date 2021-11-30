package builder;

public class Steak {
	private String name;
	
	public Steak(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
