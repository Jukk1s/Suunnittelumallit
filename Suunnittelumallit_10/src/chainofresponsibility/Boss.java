package chainofresponsibility;

public class Boss extends Administrator {
	private final double ALLOWABLE = 0.02;
	private String status = "esimies";
	
	protected String getStatus() {
		return status;
	}
	
	protected double getAllowable() {
		return ALLOWABLE;
	}
	
}
