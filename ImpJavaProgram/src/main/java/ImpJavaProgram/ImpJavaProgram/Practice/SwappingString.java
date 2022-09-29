package ImpJavaProgram.ImpJavaProgram.Practice;

public class SwappingString {

	public static void main(String[] args) {
		swapString();

	}
	public static void swapString() {
		String a = "manish";
		String b = "kumar";
		System.out.println("before swapping :-> "+a+ " , "+ b);
		a = a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("after swapping :-> "+a+ " , "+ b);
	}

}
