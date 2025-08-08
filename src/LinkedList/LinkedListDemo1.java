package LinkedList;


import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
	
		LinkedList  l = new LinkedList();
		//adding elements
		l.add(100);
		l.add("Rohini");
		l.add(true);
		l.add(null);
		l.add(6.7);
		System.out.println(l);
		System.out.println(l.size());
		
		//removing element
		l.remove(3); //index
		l.remove(6.7); // value
		System.out.println("After removing the element" +l);
		
		// inserting element in middle of linked list
		
		l.add(2, "India");
		System.out.println("After inserting element " + l);
		
		//retriving the element
		System.out.println(l.get(1));
		
		//modifying the element
		l.set(1, "Kesireddy");
		System.out.println(l);
		
		//contains
		System.out.println(l.contains("Kesireddy"));
		
		//isempty
		System.out.println(l.isEmpty());
		
		//For loop
		
		for(int i =0; i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
		// For Each Loop
		
		for(Object e : l) {
			System.out.println(e);
		}
		
		//Iterator
		
		Iterator it = l.iterator();		
		while(it.hasNext()) {
		System.out.println(it.next());
		}
		
}

}
