package strategy;

import java.util.List;
import java.util.ListIterator;

public class StrategyA implements ListConverter {
	
	public String listToString(List<String> list) {
		String rString = "";
		ListIterator<String> iterator = list.listIterator();
		
		while (iterator.hasNext()) {
			rString += iterator.next() + "\n";
		}
		
		return rString;
	}
}
