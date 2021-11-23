package memento;

public class Main {

	public static void main(String[] args) {
		Arvuuttaja arvuuttaja = new Arvuuttaja();
		Asiakas asiakas1 = new Asiakas("Aku");
		Asiakas asiakas2 = new Asiakas("Hannu");
		Asiakas asiakas3 = new Asiakas("Teppo");
		
		System.out.print(asiakas1.getNimi() + ": ");
		asiakas1.liity(arvuuttaja);
		System.out.print(asiakas2.getNimi() + ": ");
		asiakas2.liity(arvuuttaja);
		System.out.print(asiakas3.getNimi() + ": ");
		asiakas3.liity(arvuuttaja);
		
		try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }

		while (!asiakas1.getPeliLoppu() || !asiakas2.getPeliLoppu() || !asiakas3.getPeliLoppu()) {	
			asiakas1.arvaa(arvuuttaja);
			asiakas2.arvaa(arvuuttaja);
			asiakas3.arvaa(arvuuttaja);	
		}

	}

}
