package ImpJavaProgram.ImpJavaProgram.java;

public class NumberReverse {
	public static void numRevrse(int num) {
		while(num>0) {
			int dig =num%10;
			num = num/10;
			System.out.print(dig);
		}
		
	}

	public static void main(String[] args) {
		numRevrse(23456);

	}

}
