package brandfactory;

public class Main {

	public static void main(String[] args) {
		
		Jasper jasper = Jasper.getInstance();
		jasper.setClothes(new AdidasBrandFactory());
		System.out.println(jasper.toString());
		
		jasper.setClothes(new BossBrandFactory());
		System.out.println(jasper.toString());

	}
	
	
}
