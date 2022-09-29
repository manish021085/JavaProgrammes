package ImpJavaProgram.ImpJavaProgram.pattern;

public class PiramidOneFourth3 {
	public static void main(String[] args) {
		piramid(5);
	}
	
public static void piramid(int row){
        
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //for loop for row
        for(int i=1; i<=row; i++){
            //for loop for column
            for(int j=row-1; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
