package builder;

public class Waiter {
	private IBurgerBuilder burgerBuilder;
	
	public void setBurgerBuilder(IBurgerBuilder builder) {
		burgerBuilder = builder;
	}
	
	public void constructBurger() {
		burgerBuilder.createNewBurger();
		burgerBuilder.buildBun();
		burgerBuilder.buildSteak();
		burgerBuilder.buildSalad();
		burgerBuilder.buildSauce();
	}
}
