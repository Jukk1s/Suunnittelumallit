package prototype;

public class Pointer implements Cloneable {
	private int value;
	
	public Pointer(int v) {
		this.value = v;
	}
	
	public void setValue(int v) {
		value = v;
	}
	
	public int getValue() {
		return value;
	}
	
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
