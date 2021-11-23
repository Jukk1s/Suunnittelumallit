package memento;

import java.util.ArrayList;
import java.util.Random;

public class Asiakas extends Thread {
	private Object obj;
	private String nimi;
	private int arvaus;
	private ArrayList<Integer> arvatutLuvut = new ArrayList<Integer>();
	
	private boolean peliLoppu = false;
	private Random r = new Random();
	
	public Asiakas(String nimi) {
		this.nimi = nimi;
	}
	
	public void liity(Arvuuttaja a) {
		this.obj = a.liityPeliin();
	}
	
	public void arvaa(Arvuuttaja a) {
		if (!peliLoppu) {
			boolean loytyi = true;
			
			while (loytyi) {
				arvaus = r.nextInt(10);
				if (arvatutLuvut.contains(arvaus)) {
					loytyi = true;
				} else
					loytyi = false;
			}
			
			System.out.println(nimi + " arvaa luvun " + arvaus);
			arvatutLuvut.add(arvaus);
			
			peliLoppu = a.vertaa(obj, arvaus);
			
			try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
	
	public boolean getPeliLoppu() {
		return peliLoppu;
	}

	public String getNimi() {
		return nimi;
	}	
}
