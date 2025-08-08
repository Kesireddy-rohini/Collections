package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		LinkedList l =new LinkedList();
		l.add("B");
		l.add("D");
		l.add("Q");
		l.add("X");
		l.add("C");
		l.add("A");
		
		LinkedList ll = new LinkedList();
		ll.addAll(l);
		System.out.println(ll);
		
		ll.removeAll(l);
		System.out.println("After removing all elements :" + ll);
		
		// sort
		
		System.out.println("Before sorting :" +l);
	Collections.sort(l);
	System.out.println("After sorting :" +l);
	
	//reverse order
	Collections.sort(l,Collections.reverseOrder());
	System.out.println("Reverse Order :" +l);
	
	//Shuffle
	
	Collections.shuffle(l);
	System.out.println("After Shuffling " +l);

	}

}
