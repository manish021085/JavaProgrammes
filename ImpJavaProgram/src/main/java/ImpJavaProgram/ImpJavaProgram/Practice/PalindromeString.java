package ImpJavaProgram.ImpJavaProgram.Practice;

import static org.junit.Assert.assertArrayEquals;

public class PalindromeString {

	public static void main(String[] args) {
		isPalindrome();

	}
	
	public static void isPalindrome() {
		String str = "Radar";
		String rev = "";
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		if(rev.toLowerCase().equals(str.toLowerCase())) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("string is not palindrome");
		}
		
	}

}
