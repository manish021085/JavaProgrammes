package ImpJavaProgram.ImpJavaProgram.array;

import java.util.ArrayList;

public class ArrayClone {
	public static void main(String[] args) {
		ArrayList<String> names1 = new ArrayList<String>();
        names1.add("Alan");
        names1.add("Alex");
        names1.add("Bob");
        names1.add("Bryan");
        names1.add("Cathy");
        names1.add("Drake");
        System.out.println("names1 : -> "+ names1);
        ArrayList<String> names2 = new ArrayList<String>();
        names2.addAll(names1);
        System.out.println("names2 : -> "+ names2);
        int size = names2.size();
        System.out.println("names2 size : -> "+ size);
        String names3 = names2.remove(size-1);
        System.out.println("names2 : -> "+ names2);
        
	}
	

}
