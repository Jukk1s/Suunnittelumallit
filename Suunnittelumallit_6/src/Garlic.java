
public class Garlic extends PizzaDecorator {
	private double price = 1;
	
	public Garlic(Pizza pizzaToBeDecorated) {
		super(pizzaToBeDecorated);
	}
	
	@Override
	public double getPrice() {
		return price += super.getPrice();
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + "Valkosipuli \n";
	}
}
