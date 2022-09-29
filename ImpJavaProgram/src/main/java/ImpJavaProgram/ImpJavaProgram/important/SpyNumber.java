package ImpJavaProgram.ImpJavaProgram.important;

public class SpyNumber {

	public static void main(String[] args) {
		isSpyNumber(22);

	}
	
	public static void isSpyNumber(int num) {
		int sum =0;
		int pro = 1;
		int rem;
		while(num != 0) {
			rem = num%10;
			sum = sum+rem;
			pro = pro*rem;
			num = num/10;
		}
		if(sum == pro) {
			System.out.println("the number "+ num+ " is Spy number");
		}
		else {
			System.out.println("the number "+ num+ " is not Spy number");
		}
	}

}
