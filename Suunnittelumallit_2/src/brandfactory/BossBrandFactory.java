package brandfactory;

public class BossBrandFactory implements BrandFactory {
	
	public Garment makeJeans() {
		return new BossJeans();
	}
	
	public Garment makeCap() {
		return new BossCap();
	}
	
	public Garment makeTShirt() {
		return new BossTShirt();
	}
	
	public Garment makeShoes() {
		return new BossShoes();
	}
}
