package prototype;

public class Clock implements Cloneable {
	private Pointer seconds;
	private Pointer minutes;
	private Pointer hours;
	
	public Clock(Pointer h, Pointer m, Pointer s) {
		this.seconds = s;
		this.minutes = m;
		this.hours = h;
	}
	
	public void displayTime() {
		System.out.println(hours.getValue() + ":" + minutes.getValue() + ":" + seconds.getValue());
	}
	
	public Clock clone() {
		Clock c = null;
		
		try {
			c = (Clock)super.clone();
			c.seconds = (Pointer)seconds.clone();
			c.minutes = (Pointer)minutes.clone();
			c.hours = (Pointer)hours.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}		
		return c;
	}

	public void changeTime(int h, int m, int s) {
		seconds.setValue(s);
		minutes.setValue(m);
		hours.setValue(h);
	}
	
}
