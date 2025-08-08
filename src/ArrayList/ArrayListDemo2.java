package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Rohini");
		al.add("Srivani");
		al.add("Teja");
		al.add("Reshu");
		al.add("USA");
		al.add("India");
		
		ArrayList a2 = new ArrayList();
		a2.addAll(al);
		System.out.println(a2);
		System.out.println("After removing all elements");
		a2.removeAll(al);
		System.out.println(a2);

		//sorting 
		
		System.out.println("Elements in the arraylist :" +al);
		Collections.sort(al);
		System.out.println("After sorting the elements: "+al);
		
		//reverse order
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("In Reverse order: "+al);
		
		//shuffling
		
		Collections.shuffle(al);
		System.out.println("After Shuffling :" +al);
	}

}
