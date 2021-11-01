package brandfactory;

public class AdidasBrandFactory implements BrandFactory {
	
	public Garment makeJeans() {
		return new AdidasJeans();
	}
	
	public Garment makeCap() {
		return new AdidasCap();
	}
	
	public Garment makeTShirt() {
		return new AdidasTShirt();
	}
	
	public Garment makeShoes() {
		return new AdidasShoes();
	}
}
