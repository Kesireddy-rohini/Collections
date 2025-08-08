package HashMap;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		HashMap m = new HashMap();
		// HashMap<Integer, String > m = new HashMap<Integer, String>();
		
		m.put(101, "John");
		m.put(102, "Ankit");
		m.put(103, "Jie");
		m.put(104, "Holder");
		m.put(105, "Jie");
		m.put(106, "Smith");
		m.put(101, "khan");
		
		System.out.println(m);
		System.out.println(m.get(102));
		m.remove(101);
		System.out.println(m);
		
		System.out.println(m.containsKey(102));
		System.out.println(m.containsKey(107));
		
		System.out.println(m.containsValue("Ankit"));
		
		System.out.println(m.isEmpty());
		
		
		System.out.println(m.keySet());// returns all the keys as set
		System.out.println(m.values()); //returns all the values as collection
		
		System.out.println(m.entrySet()); // returns all the entries as set
		
		
		
		
		
		
		
		

	}

}
