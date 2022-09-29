package ImpJavaProgram.ImpJavaProgram.pattern;

public class PiramidOneFourth7 {
	public static void main(String[] args) {
		piramid(5);
	}

//	public static void piramid(int row) {
//		for(int i=1; i<=row; i++) {
//			for(int j=row-1; j>=i; j--) {
//				System.out.print(" ");
//			}
//			for(int k=1; k<=i; k++) {
//				System.out.print("*");
//			}
//			for(int l=2; l<=i; l++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
	public static void piramid(int row){
        for(int i=1; i<=row; i++){
            //for loop for space
            for(int j=row-1; j>=i; j--){
                System.out.print(" ");
            }
            //for loop for *
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            //for loop for *
            for(int l=2; l<=i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
