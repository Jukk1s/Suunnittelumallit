package chainofresponsibility;

public class Employee {
	private double salary;
	private String profession;
	
	public Employee(double salary, String profession) {
		this.salary = salary;
		this.profession = profession;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void increaseSalary(double amount) {
		salary += amount;
	}

	public String getProfession() {
		return profession;
	}
	
}
