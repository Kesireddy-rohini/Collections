package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("Rohini");
		al.add(31);
		al.add(20.98);
		al.add(true); // adding element at the end of array list
		System.out.println(al);
		System.out.println("Number of elements in array:" + al.size());
		al.remove(1);
		System.out.println("After removing the element:" +al);
		
		//inserting a new element
		al.add(2,"zara");
		System.out.println("After inserting new element: " +al);
        
		
		// retrive specific element
		System.out.println(al.get(2));
		
		//changing the element
		al.set(1,"java");
		System.out.println("After replacing the element:" +al);
		
		//search the element
		System.out.println(al.contains("Rohini"));
		
		//isempty
		System.out.println(al.isEmpty());
		
		
		//1. For loop
		System.out.println("Reading elements using for loop......");
		for(int i =0; i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("Reading elements using For Each loop..");
		for(Object e: al) {
			System.out.println(e);
		}
		System.out.println("Reading elements using iterator method...");
		Iterator it = al.iterator();	
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
