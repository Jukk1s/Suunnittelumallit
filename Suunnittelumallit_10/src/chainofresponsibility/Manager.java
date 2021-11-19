package chainofresponsibility;

public class Manager extends Administrator {
	private final double ALLOWABLE = 0.05;
	private String status = "päällikkö";
	
	protected String getStatus() {
		return status;
	}
	
	protected double getAllowable() {
		return ALLOWABLE;
	}
	
}
