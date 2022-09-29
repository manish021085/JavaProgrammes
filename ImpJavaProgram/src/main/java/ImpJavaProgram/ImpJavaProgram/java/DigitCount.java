package ImpJavaProgram.ImpJavaProgram.java;

public class DigitCount {
	
	public static void countDigit1(int num) {
		//dig is the count number 
		int dig =0;
		while(num!= 0) {
			num = num/10;
			dig++;
		}
		System.out.println(dig);
	}
	
	public static void  countDigit2(int num) {
		int nod = 0;
		int temp = num;
		while(temp != 0) {
			temp = temp / 10;
			nod++;
		}
		int div = (int)Math.pow(10,  nod -1);
		while(div !=0) {
			int q = num /div;
			System.out.println(q);
			num = num % div;
			div = div /10;
		}
		
		
	}

	public static void main(String[] args) {
//		countDigit1(12345678);
		countDigit2(56430);

	}

}
