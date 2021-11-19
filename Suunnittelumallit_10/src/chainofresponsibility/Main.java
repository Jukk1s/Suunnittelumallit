package chainofresponsibility;

public class Main {

	public static void main(String[] args) {
		Employee doctor = new Employee(5000, "lääkäri");
		Employee codeMonkey = new Employee(10000, "Java-kehittäjä");
		Administrator boss = new Boss();
		Administrator manager = new Manager();
		Administrator ceo = new CEO();
		boss.setSuccessor(manager);
		manager.setSuccessor(ceo);
		
		PayRaiseRequest req1 = new PayRaiseRequest(doctor, 2600);
		boss.processPayRaiseRequest(req1);
		System.out.println(doctor.getProfession() + "n palkka nyt " + doctor.getSalary() + " e \n");
		
		PayRaiseRequest req2 = new PayRaiseRequest(doctor, 10);
		boss.processPayRaiseRequest(req2);
		System.out.println(doctor.getProfession() + "n palkka nyt: " + doctor.getSalary() + " e \n");
		
		PayRaiseRequest req3= new PayRaiseRequest(codeMonkey, 5000);
		boss.processPayRaiseRequest(req3);
		System.out.println(codeMonkey.getProfession() + "n palkka nyt: " + codeMonkey.getSalary() + " e \n");
		
	}

}
