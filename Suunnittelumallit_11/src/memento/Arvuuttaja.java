package memento;
import java.util.Random;

public class Arvuuttaja {
	Random r = new Random();
	
	public Object liityPeliin() {
		int luku = r.nextInt(10);
		System.out.println(" Arvottu luku " + luku);
		Memento m = new Memento(luku);
		return m;	
	}
	
	public boolean vertaa(Object obj, int luku) {
		Memento m = (Memento) obj;
		if (m.getLuku() == luku) {
			System.out.println("Arvaus oikein!");
			return true;
		} else {
			System.out.println("Arvaus väärin.");
			return false;
		}
	}
	
	private class Memento {
		private int luku;
		
		public Memento(int luku) {
			this.luku = luku;
		}
		
		public int getLuku() {
			return luku;
		}
	}
}
