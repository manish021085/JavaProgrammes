package JavaExample.JavaExample.string;

public class StringToInteger {

	public static void main(String[] args) {
		
		String s = "200";
		
		String s1 = "300";
		int k = 300;
		
		int i = Integer.parseInt(s);
		int j = i;
		System.out.println("Converted value of string sin to integer is : "+ j);
		
		System.out.println(s1+j);
		System.out.println(k+j);
		
		System.out.println("***************************");
		Integer x = Integer.valueOf(s);
		int y = x;
		System.out.println("Converted value of string x in to integer is : "+ y);

	}

}
