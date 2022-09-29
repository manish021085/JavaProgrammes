package ImpJavaProgram.ImpJavaProgram.important;

public class SwappingNumberWithoutTemp {

	public static void main(String[] args) {
		int a = 21;
		int b = 3;
		System.out.println("Before swapping value of a & b : "+ a +" "+ b);
		//now swapping
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swapping value of a & b : "+ a +" "+ b);

	}

}
