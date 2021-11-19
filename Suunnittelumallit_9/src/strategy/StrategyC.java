package strategy;

import java.util.List;
import java.util.ListIterator;

public class StrategyC implements ListConverter {
	
	public String listToString(List<String> list) {
		String rString = "";
		
		for (int i=1; i<list.size()+1; i++) {
			if (i%3==0) {
				rString += list.get(i-1) + "\n";
			} else {
				rString += list.get(i-1);
			}
		}
		
		return rString;
	}
}
