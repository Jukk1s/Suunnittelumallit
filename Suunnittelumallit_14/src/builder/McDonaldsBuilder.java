package builder;

public class McDonaldsBuilder implements IBurgerBuilder {
	private StringBuilder burger;
	
	public void createNewBurger() {
		this.burger = new StringBuilder();
	}
	
	public void buildBun() {
		burger.append("vaalea sämpylä");
	}
	
	public void buildSteak() {
		burger.append(", sianlihapihvi");
	}
	
	public void buildSalad() {
		burger.append(", lehtisalaatti");
	}
	
	public void buildSauce() {
		burger.append(", ketsuppi");
	}
	
	public StringBuilder getBurger() {
		return burger;
	}
}
