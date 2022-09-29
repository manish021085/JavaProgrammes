package ImpJavaProgram.ImpJavaProgram.important;

public class SwappingNumberWithTemp {

	public static void main(String[] args) {
		
		int a =6;
		int b = 3;
		
		System.out.println("Before swapping value of a & b : "+ a +" "+ b);
		//swapping usint temp variable
		int temp = a+b;
		b = temp-b;
		a = temp-b;
		System.out.println("After swapping value of a & b : "+ a +" "+ b);
	}

}
