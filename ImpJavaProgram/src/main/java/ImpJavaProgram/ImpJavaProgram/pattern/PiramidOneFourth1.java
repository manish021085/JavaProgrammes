package ImpJavaProgram.ImpJavaProgram.pattern;

public class PiramidOneFourth1 {
	public static void main(String[] args) {
		pimamid1(5);
	}
	
	public static void pimamid1(int row) {
//		int row = 6;
//		int column;
		for(int i = 1; i<=row; i++) {
			for(int j=1; j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
	}

}
