package PriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo1 {

	public static void main(String[] args) {
		
		PriorityQueue q = new PriorityQueue();
		
		// adding elements add() and offer() methods
	
		  q.add("A");
		   q.add("B"); 
		  q.offer("C"); 
		  q.add("C");
		 
		System.out.println(q); //insertion order is presevered & duplicates allowed
		
		//get head element  element() , peek()
		System.out.println(q.element()); // if Queue is empty returns NoSuchElementException
		System.out.println(q.peek()); // if Queue is empty , returns NULL.
		
		//return and remove the element from queue remove() poll()
		
		System.out.println(q.remove()); // if the queue is empty it returns NoSuchElemnet Exception
		System.out.println(q);
		System.out.println(q.poll());   //if the queue is empty it returns NULL
		System.out.println(q);
		
		
		
	}

}
