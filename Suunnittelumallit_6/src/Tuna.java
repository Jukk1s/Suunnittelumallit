
public class Tuna extends PizzaDecorator {
	private double price = 2;
	
	public Tuna(Pizza pizzaToBeDecorated) {
		super(pizzaToBeDecorated);
	}
	
	@Override
	public double getPrice() {
		return price += super.getPrice();
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + "Tonnikala \n";
	}
}
