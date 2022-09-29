package JavaExample.JavaExample.important;

public class FibonacciSeries1 {

	public static void main(String[] args) {
		// call void method
		FibonacciSeries1 fs = new FibonacciSeries1();
		fs.fibonacciSeries(10);

		System.out.println("\n****************************");

		// call static second method
		fibonacciSeries1(12);

		System.out.println("\n****************************");

		// call static second method using while loop
		fibonacciSeries2(13);

	}

	public void fibonacciSeries(int num) {
		int n1 = 0, n2 = 1, n3, i;
		System.out.print(n1 + " " + n2);
		for (i = 2; i < num; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
		}

	}

	public static void fibonacciSeries1(int num) {
		int n1 = 0, n2 = 1, n3, i;
		System.out.print(n1 + " " + n2);
		for (i = 2; i < num; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
		}

	}

	public static void fibonacciSeries2(int num) {
		int n1 = 0, n2 = 1, n3, i = 0;
		System.out.print(n1 + " " + n2);
		while (i < num) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
		}

	}

}
