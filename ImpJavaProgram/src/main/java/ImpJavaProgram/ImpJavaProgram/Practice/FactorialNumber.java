package ImpJavaProgram.ImpJavaProgram.Practice;

public class FactorialNumber {

	public static void main(String[] args) {
		factNumber(5);

	}
	public static void factNumber(int num) {
		int fact=1;
		for(int i=1; i<=num; i++) {
			fact = fact*i;
		}
		System.out.println(fact);
		
	}

}
