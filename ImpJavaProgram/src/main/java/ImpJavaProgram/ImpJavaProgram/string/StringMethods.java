package ImpJavaProgram.ImpJavaProgram.string;

public class StringMethods {

	public static void main(String[] args) {
		
		//Java String toUpperCase() and toLowerCase() method
		String Lettercase = "Manish Kumar";
		System.out.println(Lettercase.toUpperCase());
		System.out.println(Lettercase.toLowerCase());
		System.out.println("******************");
		
		//trim() method eliminates white spaces before and after the String
		String trimming =" Manish Kumar ";
		System.out.println(trimming.trim());
		System.out.println("******************");
		
		//Java String startsWith() and endsWith() method
		String name = "Manish Kumar";
		System.out.println(name.startsWith("M"));
		System.out.println(name.endsWith("ar"));
		System.out.println("******************");
		
		//charAt() method returns a character at specified index
		System.out.println(name.charAt(5));
		System.out.println(name.charAt(10));
		System.out.println("******************");
		
		//length() method returns length of the specified String
		System.out.println("Length of the string name : "+ name.length());
		System.out.println("******************");
		
		//replace() method replaces all occurrence of first sequence of character with second sequence of character.
		String name1 = "Java is a programming language. Java is a platform. Java is an Island.";
		String replacedJava = name1.replace("Java", "Kava");
		System.out.println(replacedJava);
		System.out.println("******************");
		
		//represent any object as a string, toString() method
//		int a = 100;
//		int b = 200;
//		String str = "manish";
//		System.out.println(a+b+str);
		
	}

}
