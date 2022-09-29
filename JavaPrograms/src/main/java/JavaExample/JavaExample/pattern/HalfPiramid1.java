package JavaExample.JavaExample.pattern;

public class HalfPiramid1 {

	public static void main(String[] args) {

		halfPiramid(5);
		halfPiramid1(5);
		halfPiramid2(5);

	}

	public static void halfPiramid(int rows) {

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void halfPiramid1(int rows) {

		for (int i = 1; i <= rows; i++) {
			for (int j = i; j <= rows; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void halfPiramid2(int rows) {

		for (int i = 1; i <= rows; i++) {
			for (int j = i; j <= rows; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
