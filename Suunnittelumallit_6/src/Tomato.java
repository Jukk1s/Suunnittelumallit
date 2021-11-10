
public class Tomato extends PizzaDecorator {
	private double price = 2;
	
	public Tomato(Pizza pizzaToBeDecorated) {
		super(pizzaToBeDecorated);
	}
	
	@Override
	public double getPrice() {
		return price += super.getPrice();
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + "Tomaatti \n";
	}
}
