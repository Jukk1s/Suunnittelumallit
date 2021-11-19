package strategy;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = List.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J");
		
		ListConverter converter = new StrategyA();
		System.out.println(converter.listToString(list) + "\n");
		
		converter = new StrategyB();
		System.out.println(converter.listToString(list) + "\n");
		
		converter = new StrategyC();
		System.out.println(converter.listToString(list) + "\n");
	}

}
