
public abstract class PizzaDecorator implements Pizza {
	private Pizza pizzaToBeDecorated;
	
	public PizzaDecorator(Pizza pizzaToBeDecorated) {
		this.pizzaToBeDecorated = pizzaToBeDecorated;
	}
	
	public double getPrice() {
		return pizzaToBeDecorated.getPrice();
	}
	
	public String getDescription() {
		return pizzaToBeDecorated.getDescription();
	}
}
