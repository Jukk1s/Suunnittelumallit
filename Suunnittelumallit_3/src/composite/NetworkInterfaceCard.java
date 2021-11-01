package composite;

public class NetworkInterfaceCard implements Component {
	private double price;
	private String name;
	
	public NetworkInterfaceCard(String name, int price) {
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
