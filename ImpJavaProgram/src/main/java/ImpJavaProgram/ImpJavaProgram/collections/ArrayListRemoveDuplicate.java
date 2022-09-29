package ImpJavaProgram.ImpJavaProgram.collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayListRemoveDuplicate {
	/**
	 * To remove dupliates from ArrayList, 
	 * we can convert it into Set. 
	 * Since Set doesn't contain duplicate elements, 
	 * it will have only unique elements.
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("delhi");
		list.add("bombay");
		list.add("agra");
		list.add("aligarh");
		list.add("agra");
		list.add("bombay");
		System.out.println("Before converting to set");
		System.out.println(list.toString());
		System.out.println("After converting to set");
		Set<String> set = new LinkedHashSet<String>(list);
		System.out.println(set);
		}

}
