package iterator;

import java.util.Iterator;
import java.util.List;

//Yritetään tehdä muutoksia listaan iteroinnin aikana: ei onnistu
public class Main3 {

	public static void main(String[] args) {
		List<String> list = List.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J");
		Iterator<String> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			list.add("testi");
		}
	}

}
