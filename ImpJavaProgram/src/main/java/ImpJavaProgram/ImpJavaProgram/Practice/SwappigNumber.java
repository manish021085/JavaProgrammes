package ImpJavaProgram.ImpJavaProgram.Practice;

public class SwappigNumber {
	public static void main(String[] args) {
		intSwapping();
	}
	
	public static void intSwapping() {
		int a = 10;
		int b = 11;
		System.out.println("before swapping :-> "+a+ " , "+ b);
		a=a+b;
		b = a-b;
		a= a-b;
		System.out.println("after swapping :-> "+a+ " , "+ b);
	}
	

}
