package HashTable;

import java.util.Hashtable;

public class HashTableDemo1 {

	public static void main(String[] args) {
		//Hashtable t = new Hashtable(); // capacity is 11, load factor is 0.75
		 Hashtable<Integer, String> t = new Hashtable<Integer, String>();
		 
		    t.put(101, "John");
			t.put(102, "Ankit");
			t.put(103, "Jie");
			t.put(104, "Holder");
			t.put(105, "Jie");
			t.put(106, "Smith");
			
			System.out.println(t.get(104));
			t.remove(105);
			System.out.println(t);
			
		   System.out.println(t.containsKey(107));
		   System.out.println(t.containsValue("Jie"));
		   
		   System.out.println(t.isEmpty());
		   
		   System.out.println(t.keySet());
		   System.out.println(t.values());
		   
		 

	}

}
