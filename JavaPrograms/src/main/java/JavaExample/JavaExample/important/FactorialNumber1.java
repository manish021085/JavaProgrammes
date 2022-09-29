package JavaExample.JavaExample.important;

public class FactorialNumber1 {

	public static void main(String[] args) {
		//static method can direct call without creating object of class
		factorial1(5);

	}
	
	static void factorial1(int n) {
		int i, fact = 1;
		for(i=1; i<=n; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of the number : " + fact);
	}

}
