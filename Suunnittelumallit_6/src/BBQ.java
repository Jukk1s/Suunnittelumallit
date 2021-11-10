
public class BBQ extends PizzaDecorator {
	private double price = 1.5;
	
	public BBQ(Pizza pizzaToBeDecorated) {
		super(pizzaToBeDecorated);
	}
	
	@Override
	public double getPrice() {
		return price += super.getPrice();
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + "Barbeque-kastike \n";
	}
}
