package ImpJavaProgram.ImpJavaProgram.Practice;

public class PrimeNumber {

	public static void main(String[] args) {
		isPrimeNumber(19);

	}
	public static void isPrimeNumber(int num ) {
		int count=0;
		for(int i=1; i<=num; i++) {
			if(num%i == 0) {
				count++;
			}
		}
		if(count == 2)
			System.out.println("number is prime");
		else
			System.out.println("number is not prime");	
	}

}
