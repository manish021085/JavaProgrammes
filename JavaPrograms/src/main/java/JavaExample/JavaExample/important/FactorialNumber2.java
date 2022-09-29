package JavaExample.JavaExample.important;

public class FactorialNumber2 {

	public static void main(String[] args) {
		
		int i, fact = 1, num = 5;
		for(i=1;i<=num; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of the number : " + fact);
		
		//call void method from other class so need create object of class then call
		FactorialNumber f = new FactorialNumber();
		f.factorial(3);
		
		
		
			

	}

}
