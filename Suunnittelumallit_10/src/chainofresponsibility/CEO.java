package chainofresponsibility;

public class CEO extends Administrator {
	private final double ALLOWABLE = 0.51;
	private String status = "toimitusjohtaja";
	
	protected String getStatus() {
		return status;
	}
	
	protected double getAllowable() {
		return ALLOWABLE;
	}

	
}
