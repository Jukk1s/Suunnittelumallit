package composite;

public class Memory implements Component {
	private double price;
	private String name;
	
	public Memory(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}

}
