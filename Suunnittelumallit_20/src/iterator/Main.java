package iterator;

import java.util.List;
import java.util.ListIterator;

//Molemmilla säikeillä oma iteraattori
public class Main {

	public static void main(String[] args) {
		List<String> list = List.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J");
		ListIterator<String> iterator1 = list.listIterator();
		ListIterator<String> iterator2 = list.listIterator();
		
		IteratorThread thread1 = new IteratorThread(list, iterator1);
		IteratorThread thread2 = new IteratorThread(list, iterator2);
		
		thread1.start();
		thread2.start();		
	}
		
}


