package JavaExample.JavaExample.pattern;

public class HalfPiramid {

	public static void main(String[] args) {
		int rows = 5;
		// outer loop to handle number of rows
		for (int i = 1; i <= rows; i++) {
			// inner loop to handle number of columns
			// values changing acc. to outer loop
			for (int j = 1; j <= i; j++) {
				// printing stars
				System.out.print("* ");
			}
			// ending line after each row
			System.out.println();
		}

	}

}
