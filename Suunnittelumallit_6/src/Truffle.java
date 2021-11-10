
public class Truffle extends PizzaDecorator {
	private double price = 9.5;
	
	public Truffle(Pizza pizzaToBeDecorated) {
		super(pizzaToBeDecorated);
	}
	
	@Override
	public double getPrice() {
		return price += super.getPrice();
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + "Tryffeli \n";
	}
}
