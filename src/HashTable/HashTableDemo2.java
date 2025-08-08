package HashTable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo2 {

	public static void main(String[] args) {
		 Hashtable<Integer, String> t = new Hashtable<Integer, String>();
		 
		    t.put(101, "John");
			t.put(102, "Ankit");
			t.put(103, "Jie");
			t.put(104, "Holder");
			t.put(105, "Jie");
			t.put(106, "Smith");
			
			for(int k : t.keySet()) {
				System.out.println(k+ " "+t.get(k));
			}
			
			// Entry Specific Methods
			
			for(Map.Entry entry :t.entrySet()) {
				System.out.println(entry.getKey()+ " "+entry.getValue());
				
				}
			
			// Iterator()
			Set s = t.entrySet();
			Iterator itr = s.iterator();
			while(itr.hasNext()) {
			     Map.Entry entry =  (Entry) itr.next();	
			     System.out.println(entry.getKey()+ " "+entry.getValue());
			     
			}
	}

}
