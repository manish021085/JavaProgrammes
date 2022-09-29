package ImpJavaProgram.ImpJavaProgram.Practice;

public class PalindromeNumber {

	public static void main(String[] args) {
		palinNumber(535);

	}
	public static void palinNumber(int num) {
		int rem; int revNum =0; int rev;
		int orgNum = num;
		while(num>0) {
			rem = num%10;
			revNum = revNum*10 +rem; 
			num = num/10;
		}
		if(orgNum == revNum) {
			System.out.println("num is palindrome");
		}else {
			System.out.println("num is not palindrome");
		}	
	}

}
