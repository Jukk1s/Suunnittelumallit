package composite;

public class Main {

	public static void main(String[] args) {
		
		Case c = new Case("Kotelo", 89.99);
		Motherboard mb = new Motherboard("Emolevy", 99.99);
		GraphicsCard gc = new GraphicsCard("Näytönohjain", 299.99);
		Memory m = new Memory("Muistipiiri", 99.99);
		Processor p = new Processor("Prosessori", 249.99);
		
		mb.addComponent(gc);
		mb.addComponent(m);
		mb.addComponent(p);
		
		c.addComponent(mb);
		
		System.out.println("Koko paketin hinta: " + c.getPrice() + " euroa");
		
	}

}
