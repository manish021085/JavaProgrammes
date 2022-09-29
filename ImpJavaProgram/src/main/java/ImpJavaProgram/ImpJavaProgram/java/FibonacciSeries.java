package ImpJavaProgram.ImpJavaProgram.java;

public class FibonacciSeries {
	
	public static void fibonaci1(int num) {
		
		int n1 =0;
		int n2 = 1;
		int n3;
		for(int i =2; i<=num; i++) {
			System.out.println(n1);
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			
		}
	}
	public static void fibonaci2(int num) {
		int n1 =0;
		int n2=1;
		int n3;
		int i =2;
		while(i < num) {
			System.out.println(n1);
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
//			if(i==num)
//			break;
		}
	}

	public static void main(String[] args) {
		fibonaci1(6);
		System.out.println("*******************");
//		fibonaci2(12);
	}

}
