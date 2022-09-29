package ImpJavaProgram.ImpJavaProgram.string;

public class ReverseString {

	public static void main(String[] args) {

		String str = "My name is Manish";
		String reverse = "";
		String ab = "abcdefghij";
		String abc = "abcdefghij ";
		
		System.out.println(ab.length());
//		System.out.println(ab.charAt(0));
		
		System.out.println(abc.length());

		for (int i = str.length()-1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Original string: " + str);
		// Displays the reverse of given string
		System.out.println("Reverse of given string: " + reverse);
//		str = str.replace("name", "");
//		System.out.println(str);

	}

}
