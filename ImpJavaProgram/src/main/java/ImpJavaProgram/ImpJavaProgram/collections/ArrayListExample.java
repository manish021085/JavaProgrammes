package ImpJavaProgram.ImpJavaProgram.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		//add elements in Arraylist
		list.add("delhi");
		list.add("bombay");
		list.add("agra");
		list.add("aligarh");
		list.add("agra");
		//print the whole elements in arraylist
		System.out.println(list);
		
		System.out.println("Before Reversing");
		System.out.println(list.toString());
		Collections.reverse(list);
		System.out.println("After Reversing");
		System.out.println(list);
		
		System.out.println("*********0**********");
		
		//Traversing list through Iterator
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("*********1**********");
		 //Traversing list through for-each loop
		for(String city:list) {
			System.out.println(city);
		}
		
		System.out.println("*********2**********");
		//accessing the element 
		System.out.println("returning elements : "+ list.get(3));
		
		System.out.println("*********3**********");
		//changing the element
		list.set(4, "firozabad");
		for(String city:list) {
			System.out.println(city);
		}
		
		System.out.println("*********4**********");
		//Sorting the list
		Collections.sort(list);
		for(String city:list) {
			System.out.println(city);
		}
		
		System.out.println("*********4**********");
		//Creating a list of numbers
		List<Integer> num = new ArrayList<Integer>();
		num.add(21);
		num.add(108);
		num.add(27);
		num.add(5);
		num.add(3);
		Collections.sort(num);
		for(Integer number: num) {
			System.out.println(number);
		}
	}

}
