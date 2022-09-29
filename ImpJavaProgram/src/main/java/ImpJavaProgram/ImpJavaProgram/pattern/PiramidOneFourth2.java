package ImpJavaProgram.ImpJavaProgram.pattern;

public class PiramidOneFourth2 {
	public static void main(String[] args) {
		pimamid1(5);
	}
	
	public static void pimamid1(int row) {
//		int row = 6;
//		int column;
		for(int i = 1; i<=row; i++) {
			for(int j=row; j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
	}

}
