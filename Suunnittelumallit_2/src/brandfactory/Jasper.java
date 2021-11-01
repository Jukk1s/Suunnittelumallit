package brandfactory;

public class Jasper {
	private static Jasper instance = null;
	private Garment cap;
	private Garment tShirt;
	private Garment jeans;
	private Garment shoes;
	
	private Jasper() {}
	
	public static Jasper getInstance() {
		if (instance == null) {
			instance = new Jasper();
		}
		return instance;
	}
	
	@Override
	public String toString() {
		return "Minulla on päällä " + cap + ", " + tShirt + ", " + jeans + " ja " + shoes + ".";
	}
	
	public void setClothes(BrandFactory factory) {
		cap = factory.makeCap();
		tShirt = factory.makeTShirt();
		jeans = factory.makeJeans();
		shoes = factory.makeShoes();
	}
}
