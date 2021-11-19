package strategy;

import java.util.List;

public class StrategyB implements ListConverter {
	
	public String listToString(List<String> list) {
		String rString = "";
		String[] array = new String[list.size()];
		
		list.toArray(array);
		
		for (int i=0; i<array.length; i++) {
			if (i%2==1) {
				rString += array[i] + "\n";
			} else {
				rString += array[i];
			}
		}
		
		return rString;
	}
}
