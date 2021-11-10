
public class Ham extends PizzaDecorator {
	private double price = 2;
	
	public Ham(Pizza pizzaToBeDecorated) {
		super(pizzaToBeDecorated);
	}
	
	@Override
	public double getPrice() {
		return price += super.getPrice();
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + "Kinkku \n";
	}
}
