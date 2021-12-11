package facade;

public class ComputerFacade {
	private CPU cpu;
	private Memory memory;
	private HardDrive hardDrive;
	
	private int bootAddress = 13;
	private long bootSector = 1349;
	private int sectorSize = 200;
	
	public ComputerFacade(CPU c, Memory mem, HardDrive hd) {
		this.cpu = c;
		this.memory = mem;
		this.hardDrive = hd;
	}
	
	public void start() {
		cpu.freeze();
		memory.load(bootAddress, hardDrive.read(bootSector, sectorSize));
		cpu.jump(bootAddress);
		cpu.execute();
	}
}
