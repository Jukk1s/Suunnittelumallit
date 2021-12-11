package iterator;

import java.util.List;
import java.util.ListIterator;

public class IteratorThread extends Thread {
	private ListIterator<String> iterator;
	private List<String> list;
	
	public IteratorThread(List<String> l, ListIterator<String> li) {
		this.list = l;
		this.iterator = li;
	}
	
	public void setIterator(ListIterator<String> li) {
		this.iterator = li;
	}

	public void run() {
		while (iterator.hasNext()) {
			System.out.println(Thread.currentThread().getName() + ": " + iterator.next());
		}
	}
}
