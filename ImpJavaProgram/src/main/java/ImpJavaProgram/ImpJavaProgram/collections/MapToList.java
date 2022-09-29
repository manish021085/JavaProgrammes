package ImpJavaProgram.ImpJavaProgram.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapToList {
	

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("one", "java");
		map.put("two", "javascript");
		map.put("three", "python");
		
		System.out.println("Map : -> "+map);
		
		Set<Entry<String, String>> set = map.entrySet();
		
		List<Entry<String, String>> list = new ArrayList<Entry<String, String>>(set);
		System.out.println("List : -> "+list);
		
		

	}

}
