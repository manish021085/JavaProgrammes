package ImpJavaProgram.ImpJavaProgram.pattern;

public class PiramidOneFourth6 {
	public static void main(String[] args) {
		piramid(5);
	}

	public static void piramid(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = row; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
