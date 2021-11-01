package composite;

import java.util.ArrayList;
import java.util.List;

public class Motherboard implements Component {
	private double price;
	private String name;
	
	List<Component> list = new ArrayList<Component>();
	
	public Motherboard(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public void addComponent(Component c) {
		list.add(c);
		this.price += c.getPrice();
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}

}
