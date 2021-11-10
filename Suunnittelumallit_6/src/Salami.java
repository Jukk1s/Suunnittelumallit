
public class Salami extends PizzaDecorator {
	private double price = 2;
	
	public Salami(Pizza pizzaToBeDecorated) {
		super(pizzaToBeDecorated);
	}
	
	@Override
	public double getPrice() {
		return price += super.getPrice();
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + "Salami \n";
	}
}
