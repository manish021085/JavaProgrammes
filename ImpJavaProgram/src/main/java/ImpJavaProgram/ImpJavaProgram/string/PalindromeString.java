package ImpJavaProgram.ImpJavaProgram.string;

public class PalindromeString {
	/**
	 * A string is called palindrome if the number and its reverse is equal This
	 * Java program can also be used to reverse a string in Java
	 */

	public static void main(String[] args) {
		
		isPalindromeString("manish");
		isPalindromeString("abcba");

	}

	public static void isPalindromeString(String palin) {

		String str = palin;
		String revstr = "";
		int strLen = str.length();
		for (int i = strLen - 1; i >= 0; i--) {
			revstr = revstr + str.charAt(i);
		}
		if (str.toLowerCase().equals(revstr)) {
			System.out.println(palin + " is palindrome String");
		} else {
			System.out.println(palin + " is not palindrome String");
		}

	}

}
