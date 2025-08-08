package HashMap;

import java.util.HashMap;

public class HashMapDemo2 {

	public static void main(String[] args) {
	
	 HashMap m = new HashMap();
		
		m.put(101, "John");
		m.put(102, "Ankit");
		m.put(103, "Jie");
		m.put(104, "Holder");
		m.put(105, "Jie");
		m.put(106, "Smith");
		m.put(101, "khan");
		
		for(Object e : m.keySet()) {
			System.out.println(e);
		}
		
		for(Object i : m.values()) {
			System.out.println(i);
		}
		
		for(Object j : m.keySet()) {
			System.out.println(j + " "+m.get(j));
		}
		


	}

}
