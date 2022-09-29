package JavaExample.JavaExample.string;

public class IntegerToString {

	public static void main(String[] args) {
		
		
		int s = 200;
		String x = String.valueOf(s);
		String y = x;
		System.out.println("Converted value of string x in to integer is : "+ y);
		System.out.println(s+100);
		System.out.println(y+100);
		
		System.out.println("***************************");
		String d = String.format("%d", s);
		String p = d;
		System.out.println(s+100);
		System.out.println(p+100);

		
	}

}
