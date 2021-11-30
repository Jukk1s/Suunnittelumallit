package builder;

public interface IBurgerBuilder {
	public abstract void createNewBurger();
	public abstract void buildBun();
	public abstract void buildSteak();
	public abstract void buildSalad();
	public abstract void buildSauce();
	
	public abstract Object getBurger();
}
