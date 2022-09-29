package ImpJavaProgram.ImpJavaProgram.pattern;

public class PiramidOneFourth5 {
	public static void main(String[] args) {
		piramid(5);
	}

	public static void piramid(int row) {

		for (int i = 1; i <= row; i++) {
			for (int j = row-1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
				// if provide space after * it will print triangle
			}
			System.out.println();
		}
	}

}
