package iterator;

import java.util.List;
import java.util.ListIterator;


//Säikeet käyttävät samaa iteraattoria
public class Main2 {

	public static void main(String[] args) throws InterruptedException {
		List<String> list = List.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J");
		ListIterator<String> iterator = list.listIterator();
		
		IteratorThread thread1 = new IteratorThread(list, iterator);
		IteratorThread thread2 = new IteratorThread(list, iterator);
		
		thread1.start();
		thread2.start();

	}

}
