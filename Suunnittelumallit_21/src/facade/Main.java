package facade;

public class Main {

	public static void main(String[] args) {
		CPU cpu = new CPU();
		HardDrive hardDrive = new HardDrive();
		Memory memory = new Memory();
		
		ComputerFacade computer = new ComputerFacade(cpu, memory, hardDrive);
		computer.start();
	}
}
