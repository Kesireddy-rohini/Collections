package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {

	public static void main(String[] args) {
	// coverting Array into ArrayList
		String arr[]= {"cat","dog","pig"};
		for(String value : arr) {
		System.out.println(value);
		}
		ArrayList al = new ArrayList(Arrays.asList(arr));
		System.out.println(al);
		
	}

}
