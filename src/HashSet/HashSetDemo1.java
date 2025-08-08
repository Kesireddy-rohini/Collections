package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		// HashSet hs = new HashSet(100); // initial capacity = 100
		//	HashSet hs = new HashSet(100, (float)0.90); // intial capacity is 100, load factor is 0.90
		// HashSet<Integer> hs = new HashSet<Integer>();
		
		HashSet hs = new HashSet();// default capacity is 16, load factor  is 0.75
        
		// adding objects/ elements into Hashset
		hs.add("Rohini");
		hs.add(100);
		hs.add(9.8);
		hs.add('r');
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs);
		
		//remove element
		hs.remove(9.8);
		System.out.println("After removing the element :" +hs);

		//contains()
		System.out.println(hs.contains(true));
		
		//isempty()
         System.out.println(hs.isEmpty());		
         
         //Reading elements from Hashset using For ..each loop
         
         for(Object e : hs) {
        	 System.out.println(e);
         }
         
       //Reading elements from Hashset using Iterator
         
       Iterator it = hs.iterator();
       while(it.hasNext()) {
    	   System.out.println(it.next());
       }
         
         
	}

}
