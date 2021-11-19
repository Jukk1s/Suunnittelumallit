package chainofresponsibility;

public class PayRaiseRequest {
	private Employee employee;
	private double amount;
	
	public PayRaiseRequest(Employee e, double amount) {
		this.employee = e;
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public Employee getEmployee() {
		return employee;
	}
	
}
