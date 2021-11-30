package builder;

import java.util.ArrayList;

public class HesburgerBuilder implements IBurgerBuilder {
	private ArrayList<Object> burger;
	
	public void createNewBurger() {
		this.burger = new ArrayList<Object>();
	}
	
	public void buildBun() {
		burger.add(new Bun("ruissämpylä"));
	}
	
	public void buildSteak() {
		burger.add(new Steak("naudanlihapihvi"));
	}
	
	public void buildSalad() {
		burger.add(new Salad("jäävuorisalaatti"));
	}
	
	public void buildSauce() {
		burger.add(new Sauce("kurkkumajoneesi"));
	}
	
	public ArrayList<Object> getBurger() {
		return burger;
	}
}
