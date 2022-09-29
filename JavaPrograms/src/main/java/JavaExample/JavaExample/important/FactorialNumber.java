package JavaExample.JavaExample.important;

public class FactorialNumber {

	public static void main(String[] args) {
		//for calling non-static method need to create object of class then call method.
		FactorialNumber f = new FactorialNumber();
		f.factorial(5);

	}
	
	public void factorial(int n) {
		int i, fact = 1;
		for(i=1; i<=n; i++) {
			fact = fact*i;
		}

			System.out.println("Factorial of the number : " + fact);	
	}

}
