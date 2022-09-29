package ImpJavaProgram.ImpJavaProgram.important;

public class PrimeNumber {
	/**
	 * A prime number is a number that is divisible by only two numbers: 1 and itself. 
	 * So, if any number is divisible by any other number, it is not a prime number.
	 */
	public static void main(String[] args) {
//		isPrimenumber(7);
		isPrimenumber(12);
	}
	
	public static void isPrimenumber(int num) {
		int count = 0;
		for(int div =1; div<=num; div++) {
			if (num%div ==0) {
				count++;
			}
		}
		if(count ==2) {
			System.out.println("Number : "+ num+ " is prime");
		}else {
			System.out.println("Number : "+ num+ " is not prime");
		}
		
	}
	

}
