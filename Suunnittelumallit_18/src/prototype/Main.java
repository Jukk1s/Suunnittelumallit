package prototype;

public class Main {

	public static void main(String[] args) {
		
		Pointer h = new Pointer(6);
		Pointer min = new Pointer(18);
		Pointer sec = new Pointer(54);
		
		Clock c = new Clock(h,min,sec);
		Clock cClone = c.clone();
		
		cClone.changeTime(21, 37, 19);
		
		c.displayTime();
		cClone.displayTime();

	}

}
