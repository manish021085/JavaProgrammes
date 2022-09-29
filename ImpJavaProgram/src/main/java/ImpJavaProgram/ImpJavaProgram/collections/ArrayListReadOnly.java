package ImpJavaProgram.ImpJavaProgram.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListReadOnly {
	/**
	 * The read-only means unmodifiable view of Collection 
	 * in which we can not perform any operation which 
	 * will change the collection through 
	 * add(), remove() or set() method. 
	 * We can obtain read-only collection from the existing 
	 * collection by calling 
	 * Collections.unmodifiableCollection() method.
	 */
			
	public static void main(String[] args) {
	
		List<String> list = new ArrayList<String>();
		list.add("delhi");
		list.add("bombay");
		list.add("agra");
		list.add("aligarh");
		System.out.println(list);
		System.out.println("*********0**********");
		
		List<String> unmodifiableList = Collections.unmodifiableList(list);
		unmodifiableList.add("firozabad");
		System.out.println(list);
		System.out.println("*********0**********");
		System.out.println(unmodifiableList);
		System.out.println("*********0**********");
	}

}
