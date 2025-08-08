package PriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo2 {

	public static void main(String[] args) {
		
PriorityQueue q = new PriorityQueue();
		
		// adding elements add() and offer() methods
	
		  q.add("A");
		   q.add("B"); 
		  q.offer("C"); 
		  q.add("C");
		// Iterator
		Iterator  it = q.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		//For each loop
		for(Object e : q) {
			System.out.println(e);
		}
	}

}
