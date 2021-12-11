package facade;

public class Memory {
	
	public void load(long position, byte[] data) {
		System.out.println("Memory: Loading data from " + position);
		
		for (int i = 0 ; i < data.length ; i++) {
			System.out.println(i + ": " + data[i]);
		}
	}
}
