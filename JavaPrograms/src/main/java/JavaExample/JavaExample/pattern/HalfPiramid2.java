package JavaExample.JavaExample.pattern;

public class HalfPiramid2 {

	public static void main(String[] args) {
		
halfPiramid(5);

	}
	
	public static void halfPiramid(int rows) {
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
