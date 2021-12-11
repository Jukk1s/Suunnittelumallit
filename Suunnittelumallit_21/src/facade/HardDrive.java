package facade;

public class HardDrive {
	
	public byte[] read(long lba, int size) {
		System.out.println("Hard Drive: Reading data");
		byte[] bytes = new byte[size];
		
		for(int i = 0; i < size; i++) {
    		bytes[i] = (byte)(i+(int)lba);
    	}
		System.out.println(bytes);
    	return bytes;
	}
}
