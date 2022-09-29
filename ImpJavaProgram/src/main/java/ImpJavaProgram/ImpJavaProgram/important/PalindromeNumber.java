package ImpJavaProgram.ImpJavaProgram.important;

public class PalindromeNumber {
	/**
	 * A number is called palindrome if the number
	 * and its reverse is equal
	 * This Java program can also be used to reverse a number in Java
	 */


	public static void main(String[] args) {
		isPalindromeNum(123);
		isPalindromeNum(121);

	}
	
	public static void isPalindromeNum(int num) {
		int pNumber =num;
		int rev=0;
		int reminder;
		while(pNumber > 0) {
			reminder = pNumber % 10;
			rev = rev * 10 + reminder;
			pNumber = pNumber/10;
			
			
		}
		if(num == rev) {
			System.out.println(num + " is Palindrome");
		}
		else {
			System.out.println(num + " is not Palindrome");
		}
		
	}

}
