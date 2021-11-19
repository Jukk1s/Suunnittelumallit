package chainofresponsibility;

public abstract class Administrator {
	private Administrator successor;
	private double ALLOWABLE;
	
	public void setSuccessor(Administrator s) {
		successor = s;
	}
	
	abstract protected String getStatus();
	abstract protected double getAllowable();
	
	public void processPayRaiseRequest(PayRaiseRequest r) {
		double ratio = r.getAmount() / r.getEmployee().getSalary();
		
		if (ratio > this.getAllowable() && successor != null) {
			System.out.println("Siirretäänpä " + r.getEmployee().getProfession() + "n "+ r.getAmount() + " euron palkankorotuspyyntö eteenpäin. T: " + this.getStatus());
			successor.processPayRaiseRequest(r);
		} 
		else if (ratio < this.getAllowable()) {
			System.out.println(r.getEmployee().getProfession() + "n "+ r.getAmount() + " euron palkankorotuspyyntö hyväksytty. T: " + this.getStatus());
			r.getEmployee().increaseSalary(r.getAmount());
		} else {
			System.out.println(r.getEmployee().getProfession() + "n " + r.getAmount() + " euron palkankorotuspyyntö hylätty. T: " + this.getStatus());
		}
			
	}
}
