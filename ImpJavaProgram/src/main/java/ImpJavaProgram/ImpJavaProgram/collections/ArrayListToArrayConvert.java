package ImpJavaProgram.ImpJavaProgram.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArrayConvert {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("delhi");
		list.add("bombay");
		list.add("agra");
		list.add("aligarh");
		list.add("agra");
		
		System.out.println("Converting ArrayList to Array" );
		String[] cityArray = list.toArray(new String[list.size()]);
		for(String cityA : cityArray) {
			System.out.println(cityA);
		}
		System.out.println("Converting Array to ArrayList" );
		List<String> cityAL = new ArrayList<String>();
		cityAL = Arrays.asList(cityArray);
		System.out.println(cityAL);

	}

}
