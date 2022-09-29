package ImpJavaProgram.ImpJavaProgram.pattern;

public class FullPiramid {

	public static void main(String[] args) {
		fullPiramid(5);

	}
	
	public static void fullPiramid(int rows) {
		for(int i=1;i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=rows;i++) {
			for(int j=i;j<=rows;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
