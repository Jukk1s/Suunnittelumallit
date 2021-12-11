package iterator;

import java.util.Iterator;
import java.util.List;


//UnsupportedOperationException
public class Main4 {

	public static void main(String[] args) {
		List<String> list = List.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J");
		Iterator<String> iterator = list.iterator();
		
		while (iterator.hasNext()) {		
			iterator.remove();
		}
		
	}

}
