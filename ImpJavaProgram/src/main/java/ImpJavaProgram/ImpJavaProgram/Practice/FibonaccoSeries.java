package ImpJavaProgram.ImpJavaProgram.Practice;

public class FibonaccoSeries {

	public static void main(String[] args) {
		fiboSeries(10);

	}
	public static void fiboSeries(int num) {
		int n1 =0;
		int n2 =1;
		int n3;
		System.out.print(n1+ " , "+n2 );
		for(int i=2; i<=num; i++) {
			n3 = n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" , "+n3);
		}
	}

}
