package ImpJavaProgram.ImpJavaProgram.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> lt = new LinkedList<String>();
		// add elements in Arraylist
		lt.add("delhi");
		lt.add("bombay");
		lt.add("agra");
		lt.add("aligarh");
		lt.add("agra");
		// print the whole elements in arraylist
		System.out.println(lt);
		
		System.out.println("Before Reversing");
		System.out.println(lt.toString());
		Collections.reverse(lt);
		System.out.println("After Reversing");
		System.out.println(lt);
		
		((LinkedList<String>) lt).addFirst("etah");
		System.out.println(lt);
		((LinkedList<String>) lt).addLast("ghaziabad");
		System.out.println(lt);
		
		//Removing specific element from list 
		lt.remove("agra");
		System.out.println(lt);
		lt.remove(1);
		System.out.println(lt);
		
		//Traversing the list of elements in reverse order
		Iterator itr = ((LinkedList<String>) lt).descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
