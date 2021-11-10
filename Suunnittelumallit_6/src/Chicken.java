
public class Chicken extends PizzaDecorator {
	private double price = 2;
	
	public Chicken(Pizza pizzaToBeDecorated) {
		super(pizzaToBeDecorated);
	}
	
	@Override
	public double getPrice() {
		return price += super.getPrice();
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + "Kana \n";
	}
}
