package ImpJavaProgram.ImpJavaProgram.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListIterate {

	public static void main(String[] args) {
		List<String> family = new ArrayList();
		family.add("Shri Hardam Singh");
		family.add("Smt. Pravesh Kumari");
		family.add("Manish Kumar Singh");
		family.add("Girjesh Kumar Singh");
		family.add("Neelima Rajput");
		family.add("Upasana Rajput");
		family.add("Devanshi Rajput");
		family.add("Anaisha rajput");
		//printing the list normally
//		System.out.println(family);
		
		//Traversing list through Iterator
//		System.out.println("Traversing list through Iterator using while loop :");
		Iterator itr = family.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		System.out.println("Traversing list through Iterator using for loop :");
		for(int i=0; i<family.size(); i++) {
//			System.out.println(family.get(i));
		}
		
		System.out.println("Traversing list through Iterator using for-each loop :");
		for(String fam:family) {
//			System.out.println(fam);
		}
		
		System.out.println("Traversing list through List Iterator:");
		
		ListIterator<String> fami = family.listIterator(family.size());
//		while(fami.hasNext()) {
//			String str1 = fami.next();
//			System.out.println(fami);
//		}
		System.out.println("Traversing list through List Iterator in reverse order :");
		//Here, element iterates in reverse order 
		while(fami.hasPrevious()) {
			String str2 = fami.previous();
			System.out.println(str2);
		}
		
		System.out.println("Traversing list through List Iterator using for loop:");
		for(int i=0; i<family.size(); i++) {
			System.out.println(family.get(i));
		}
		
//		System.out.println("Traversing list through forEach() using lambda expression method:");
//		family.forEach(famil -> {
//			System.out.println(famil);
//		});
		
//		System.out.println("Traversing list through forEachRemaining() method:");
//		itr.forEachRemaining(fa -> {
//			System.out.println(fa);
//		});
		//adding both lists
		System.out.println("Traversing list through forEachRemaining() method after adding both list");
		List<String> list = new ArrayList<String>();
		//add elements in Arraylist
		list.add("delhi");
		list.add("bombay");
		list.add("agra");
		list.add("aligarh");
		list.add("agra");
		
		family.addAll(list);
		//printing the list normally
		System.out.println(family);
		
	}

}
