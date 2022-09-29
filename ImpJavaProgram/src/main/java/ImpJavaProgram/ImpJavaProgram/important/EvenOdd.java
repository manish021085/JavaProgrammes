package ImpJavaProgram.ImpJavaProgram.important;

public class EvenOdd {

	public static void main(String[] args) {
		
		isEvenOdd(25);
		isEvenOdd(42);

	}
	public static void isEvenOdd(int num) {
		
		if(num%2 ==0) {
			System.out.println(num + " is even number");
		}
		else {
			System.out.println(num + " is odd number");
		}	
	}

}
